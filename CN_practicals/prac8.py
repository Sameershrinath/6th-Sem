import socket 

host="0.0.0.0"
port=5035

server_socket=socket.socket(socket.AF_INET,socket.SOCK_STREAM)

server_socket.bind((host,port))


server_socket.listen(5)
print("Listening...")
print("Waiting for the connection")

client_socket,addr=server_socket.accept()
print(addr)
data=client_socket.recv(4096).decode()
print(data)


client_socket.send(data.encode())

client_socket.close()
server_socket.close()