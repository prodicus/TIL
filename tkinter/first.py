#!/usr/bin/env python3.4

from tkinter import *


class Window(Frame):

    def __init__(self, master = None):
        
        Frame.__init__(self, master)
        self.master = master                ## means that this is our master widget

        self.init_window()


    def init_window(self):

        self.master.title("GUI")
        self.pack(fill = BOTH, expand = 1)

        quitButton = Button(self, text = "Quit", command = sys.exit)

        quitButton.place(x = 100, y = 20 )          ## decides where the button should be placed in the frame

        ## now to give the default shape of the window

        ## now give the button an event handling tool and make it actually quit the window

root = Tk()
root.geometry("400x300")


app = Window(root)
root.mainloop()             ## basically initializes and generates our window for us