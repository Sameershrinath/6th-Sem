import socket

host = "127.0.0.1"   # Server IP
port = 5035

# Create socket
client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

# Connect to server
client_socket.connect((host, port))

# Input message
message = input("Enter message: ")

# Send data
client_socket.send(message.encode())

# Receive response
response = client_socket.recv(4096).decode()
print("Server echo:", response)

# Close
client_socket.close()