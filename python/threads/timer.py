#!/usr/bin/env python3.4
from threading import Thread  
import time

def timer(name, delay, repeat ):
    print("Timer : " + name + " has started ")
    while repeat > 0 : 
        time.sleep(delay)
        print("name : " + name + " time : " + str(time.ctime(time.time())))
        repeat -= 1

    print("Timer : "+ name + " completed ")


def main():
    t1 = Thread(target = timer, args = ("Timer 1", 1, 4 ))
    t2 = Thread(target = timer, args = ("Timer 2", 2, 5 ))

    t1.start()
    t2.start()
    print("Main completed :")

main()