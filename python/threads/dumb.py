#!/usr/bin/env python3.4

import time

def countdown(n):
    while n > 0:
        n -= 1

count = 50000000

start = time.time()
countdown(count)
end = time.time()
var = end - start
print("Total :", var)