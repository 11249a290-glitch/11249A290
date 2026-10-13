import socket
def file_transfer_server():
    server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    server_socket.bind(('localhost', 12345))
    server_socket.listen(5)
    print("Server listening on port 12345...")
    connection, client_address = server_socket.accept()
    print(f"Connected by {client_address}")
    filename = connection.recv(1024).decode()
    print(f"Receiving file: {filename}")
    with open(f"received_{filename}", 'wb') as file:
        while True:
            data = connection.recv(4096)  # 4KB chunks for better performance
            if not data:
                break
            file.write(data)
    print(f"File successfully saved as: {filename}")
    connection.close()
    server_socket.close()
if __name__ == '__main__':
    file_transfer_server()