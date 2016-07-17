#!/usr/bin/env python
# encoding: utf-8

from functools import wraps


class Coordinates(object):
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __repr__(self):
        return "Coord: " + str(self.__dict__)


def checker(func):
    @wraps(func)
    def decorator(a, b):
        if a.x < 0 or a.y < 0:
            a = Coordinates(a.x if a.x > 0 else 0, a.x if a.y > 0 else 0)
        if b.x < 0 or b.y < 0:
            b = Coordinates(a.x if a.x > 0 else 0, b.y if b.y > 0 else 0)
        ret = func(a, b)
        if ret.x < 0 or ret.y < 0:
            ret = Coordinates(ret.x if ret.x > 0 else 0, ret.y if ret.y > 0 else 0)
        return ret
    return decorator

def add(a, b):
    return Coordinates(a.x + b.x, a.y + b.y)

def sub(a, b):
    return Coordinates(a.x - b.x, a.y - b.y)

if __name__ == "__main__":
    obj1 = Coordinates(100, 200)
    obj2 = Coordinates(300, 200)
    obj3 = Coordinates(-100, -100)

    print sub(obj1, obj2)

    add = checker(add)
    print add(obj1, obj3)


