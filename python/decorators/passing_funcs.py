#!/usr/bin/env python

def is_even(value):
    return (value % 2) == 0

def count_occurences(my_list, my_predicate):
    return sum([1 for e in my_list if my_predicate(e)])

my_predicate = is_even
my_list = [2, 4, 6, 7, 9, 11]

print count_occurences(my_list, my_predicate)
