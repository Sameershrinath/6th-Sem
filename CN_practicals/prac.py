import socket 

host="0.0.0.0"
port=5035

server_socket=socket.socket(socket.AF_INET,socket.SOCK_STREAM)

server_socket.bind((host,port))

server_socket.listen(5)
print("Listening at port 5035...")
print("Waaiting for the connection")

client_socket,addr=server_socket.accept()
print("Connected client",addr)

data=client_socket.recv(4096).decode()
print("Client : ", data)

client_socket.send(data.encode())

client_socket.close()
server_socket.close()