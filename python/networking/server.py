#/usr/bin/env python3.4

from threading import Threads
import time 
from socket import *

host = ''
port = 50007
sockobj = socket(AF_INET, SOCK_STREAM)
sockobj.bind((host, bind))
sockobj.listen(5)

def run():
	return time.ctime(time.time())

def handleClient():
	time.sleep(5)
	while True : 
		data = connection.recv(1024)
		if not data : break 
		reply = ' Reply => %s at %s ' %(data, run())
		connection.send(reply)
	connection.close()

def main():
	while True:
		connection, address = sockobj.accept()
		print("Server is connected at : " + address + " at : " + run())
		t = Thread(target = handleClient, args(connection, ))
		t.start()

main()

