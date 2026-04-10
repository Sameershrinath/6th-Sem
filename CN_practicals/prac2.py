import socket 

host="127.0.0.1"
port=5035

client_socket=socket.socket(socket.AF_INET,socket.SOCK_STREAM)

client_socket.connect((host,port))

data=input("Enter Message : ")

client_socket.send(data.encode())

received=client_socket.recv(4096).decode()
print("Server :",received)

client_socket.close()