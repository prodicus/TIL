#!/usr/bin/env python
# encoding: utf-8

from __future__ import print_function
import multiprocessing

def worker(num):
    """The `num` passed should be pickle-lable"""
    print("hello there", num)
    return

if __name__ == "__main__":
    jobs = []
    for i in range(5):
        p = multiprocessing.Process(target=worker, args=(i,))
        jobs.append(p)
        p.start()

