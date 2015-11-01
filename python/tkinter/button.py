#!/usr/bin/env python3.4

from tkinter import *
import sys

root = Tk()
Label(root, text = "Just some random sh*t").pack(expand = YES, fill = BOTH)
Button(root, text = "Quit", command = sys.exit).pack(expand = YES, fill = BOTH)
root.mainloop()