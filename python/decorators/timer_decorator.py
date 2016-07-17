#!/usr/bin/env python
# encoding: utf-8

import timer
from functools import wraps

def timit(func):
    def wrapper(*args, **kwargs):

