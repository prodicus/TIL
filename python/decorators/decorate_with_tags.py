#!/usr/bin/env python
# encoding: utf-8

"""An example for a function returning a function"""

def surround(tag1, tag2):
    def wraps(content):
        return '{}{}{}'.format(tag1, content, tag2)
    return wraps

def printer(content, transform):
    return transform(content)

print printer("foo bar", surround("<a>", "</a>"))

print printer("foo bar", surround('<p>', '</p>'))

