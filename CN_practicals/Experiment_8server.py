import socket
host = "0.0.0.0"   # Listen on all interfaces
port = 5035

# Create socket
server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

# Bind
server_socket.bind((host, port))

# Listen
server_socket.listen(5)
print("Server started...")
print("Waiting for connection...")

# Accept connection
client_socket, addr = server_socket.accept()
print(f"Connected to {addr}")

# Receive data
data = client_socket.recv(4096).decode()
print("Client:", data)

# Send response (echo)
client_socket.send(data.encode())

# Close
client_socket.close()
server_socket.close()