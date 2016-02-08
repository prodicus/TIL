#!/usr/bin/env python3.4

from tkinter import *

root = Tk()
ent = Entry(root)

def fetch():
	print("Input => %s "%(ent.get()))
	ent.delete(0, END)

def main():

	ent.insert(0, 'Enter type of text here :')
	ent.pack(side = TOP, fill = X)

	ent.focus()
	ent.bind('<Return>', (lambda event : fetch()))

	Button(root, text = "Fetch", command = fetch).pack(side = LEFT)
	Button(root, text = "Quit", command = sys.exit).pack(side = RIGHT)

	root.mainloop()

main()