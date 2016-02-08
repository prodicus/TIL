#!/usr/bin/env python3.4

from tkinter import *
import sys

root = Tk()
Label(root, text = "This stuff is crazy!").pack(side = TOP, expand = YES, fill = BOTH)
Button(root, text = "Quit", command = sys.exit).pack(side = LEFT, expand = YES, fill = BOTH)
Button(root, text = "Hello", command = (lambda : print("Hey fucker! :D"))).pack(side = RIGHT, expand = YES, fill = BOTH)

root.mainloop()