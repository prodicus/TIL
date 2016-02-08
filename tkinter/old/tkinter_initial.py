#!/usr/bin/env python3.4

from tkinter import * 
## Gets the whole of the class inside the library we just mentioned 

def hi():
    print("Again a hi")
    sys.exit()

def main():
    root = Tk()

    win = Frame()
    win.pack()

    Label(root, text = "Hello there ").pack(side = TOP, expand = True)
    Button(root, text = "Greeting", command = hi).pack(side = LEFT, expand = True)
    Button(root, text = "Exit", command = sys.exit).pack(side = RIGHT, expand = True)

    root.mainloop()

main()