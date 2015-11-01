clienthost = "localhost"
clientport = 50007 
clientobj = socket(AF_INET, SOCK_STREAM)
clientobj.bind((clienthost, clientport))

message = ["This", "is a" , "message"]

for word in message:
	clientobj.send(word)
	data = clientobj.recv(1024)
	print("client received some data ", data)

clientobj.close()
