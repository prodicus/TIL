#!/usr/bin/env python3.4

from tkinter import *
import sys

root = Tk()
Label(root, text = "first name").grid(row = 0)
Label(root, text = "last name").grid(row = 1)

e1 = Entry(root)
e2 = Entry(root)

e1.grid(row = 0, column = 1)
e2.grid(row = 1, column = 1)

def getit():
    print("First name : %s \nLast name : %s" % (e1.get(), e2.get()))
    e1.delete(0, END)
    e2.delete(0, END)

Button(root, text = "Quit", command = sys.exit).grid(row = 2, column = 0)
Button(root, text = "Show", command = getit).grid(row = 2, column = 1)

root.bind("<Return>", (lambda event : getit()))

root.mainloop()