def xor(a, b):
    result = []
    # FIX: Loop through the entire length of the strings starting from index 0
    for i in range(0, len(b)):
        if a[i] == b[i]:
            result.append('0')
        else:
            result.append('1')
    return ''.join(result)


def mod2div(dividend, divisor):
    pick = len(divisor)
    temp = dividend[0:pick]

    while pick < len(dividend):
        if temp[0] == '1':
            # xor returns a string of length 'pick', [1:] removes the leading '0'
            temp = xor(divisor, temp)[1:] + dividend[pick]
        else:
            # FIX: Use '0' * pick to match the actual length of temp
            temp = xor('0' * pick, temp)[1:] + dividend[pick]
        pick += 1

    if temp[0] == '1':
        temp = xor(divisor, temp)[1:]
    else:
        temp = xor('0' * pick, temp)[1:]

    return temp


# Sender Side
data = input("Enter Data Bits: ")  # Example: 1001
key = input("Enter Generator Polynomial: ")  # Example: 1011

l_key = len(key)

# Append zeros
appended_data = data + '0' * (l_key - 1)

# Calculate CRC
remainder = mod2div(appended_data, key)
codeword = data + remainder

print("\nCRC Remainder :", remainder)
print("Transmitted Codeword :", codeword)

# Receiver Side
received = input("\nEnter Received Codeword: ")

check = mod2div(received, key)

# FIX: Check if there are any '1's in the remainder string
if '1' not in check:
    print("No Error Detected")
else:
    print("Error Detected")
