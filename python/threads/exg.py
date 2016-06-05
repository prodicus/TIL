from threading import Thread

def worker(argv):
    print("Worker: ", argv % 10)


for i in range(5):
    Thread(target=worker, args=(i,)).start()
