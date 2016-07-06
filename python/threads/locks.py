import threading

class Thread(threading.Thread):
    def __init__(self, t, *args):
        threading.Thread.__init__(self, target=t, args=args)
        self.start()

count = 0
lock = threading.Lock()

def increment():
    global count
    lock.acquire()
    try:
        count += 1
    finally:
        lock.release()

def hello_there():
    while True:
        increment()

def bye():
    while True:
        increment()

def main():
    hello = Thread(hello_there)
    bye = Thread(bye)

    while True:
        print count

if __name__ == "__main__":
    main()
