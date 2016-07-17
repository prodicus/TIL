#!/usr/bin/env python
# encoding: utf-8

"""Writing an example decorator"""

from functools import wraps

def currency(f):
    @wraps(f)
    def wraps(*args, **kwargs):
        return 'sum = ' + str(f(*args, **kwargs))
    return wraps

@currency
def simple_sum(a, b):
    return a+b

@currency
def simple_words(foo, bar, sum_is):
    return foo + bar + str(sum_is)

if __name__ == "__main__":
    print simple_sum(10, 20)
    print simple_words("foo", "bar", 20)
