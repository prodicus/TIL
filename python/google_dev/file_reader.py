#!/usr/bin/python2.7 -tt

# so what this proram does is

import sys

def cat(filename):
	f = open(filename, 'rU') 
	for line in f : 
		print line, 
	f.close()

def main() : 
	cat(sys.argv[1])

main()