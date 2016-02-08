#!/usr/bin/env python3.4

from tkinter import *
import sys

root = Tk()

Label(root, text = "Enter text : ").grid(row = 0, column = 0)

e1 = Entry(root)
e1.grid(row = 1 , column = 0)

Label(root, text = "Entered stuff : ").grid(row = 0 , column = 1)

e2 = Entry(root)
e2.grid(row = 1, column = 1)

data = []

def printit():
    var = e1.get()
    data.append(var)
    e1.delete(0, END)
    e2.delete(0, END)
    e2.insert(0, data)

Button(root, text = "Quit", command = sys.exit).grid(row = 2, column = 0)
Button(root, text = "print", command = printit).grid(row = 2, column = 1)
root.bind("<Return>", lambda event : printit())

root.mainloop()