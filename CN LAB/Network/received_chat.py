import socket
import threading
def receive_messages(client_socket):
    while True:
        try:
            message = client_socket.recv(1024).decode()
            if not message:
                print("\nDisconnected from server.")
                break
                # Added a newline prefix to separate incoming text from what you are typing
            print(f"\n{message}")
        except Exception:
            # Clean exit when socket is closed intentionally by the main thread
            break
def chat_client():
    client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    try:
        client_socket.connect(('localhost', 55555))
        print("Connected to chat server. Type 'exit' to quit.")
    except Exception as e:
        print(f"Unable to connect: {e}")
        return
    receive_thread = threading.Thread(
        target=receive_messages,
        args=(client_socket,),
        daemon=True
    )
    receive_thread.start()
    while True:
        try:
            message = input()
            if message.lower() == "exit":
                break
            if message.strip():  # Avoid sending empty messages
                client_socket.sendall(message.encode())
        except Exception as e:
            print(f"Error sending message: {e}")
            break
    client_socket.close()
    print("Logged out successfully.")
if __name__ == '__main__':
    chat_client()