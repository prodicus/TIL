#!/usr/bin/env python3


"""
envato level 3
"""

from tkinter import Tk


# def show_entry_fields():
#     print("First name : %s \nLast name : %s" %(e1.get(), e2.get()))

def main():
    root = Tk()
    Label(root, text="First name :").grid(row=0)
    Label(root, text="Last name : ").grid(row=1)

#   inserted the labels, now the time for the Buttons 
    e1 = Entry(root)
    e2 = Entry(root)

    e1.grid(row = 0, column = 1)
    e2.grid(row = 1, column = 1)

    ## adding the get and quit buttons at the bottom of the GUI application 

    Button(root, text="Quit", command=sys.exit).grid(row=3, column=0, sticky=W, pady=4 )
    Button(root, text="Submit", command=(lambda x, y: e1.get(), e2.get())).grid(row=3, column=1, sticky=W, pady = 4)
    # Button(root, text = "Submit", command = show_entry_fields).grid(row = 3, column = 1 , sticky = W, pady = 4)

    root.mainloop()



if __name__=="__main__":   main()