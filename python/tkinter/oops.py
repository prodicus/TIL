#!/usr/bin/env python3.4

from tkinter import *

class MyButton(Button):

    def __init__(self, parent = None, **config):
        Button.__init__(self, parent, **config)
        self.pack(expand = YES, fill = BOTH)
        self.config(command = self.callback)

    def callback(self):
        print("Bading goodbye to you")
        self.quit()

if __name__ == "__main__":
    MyButton(text = "Today's a good day").mainloop()    