from tkinter import *

window = Tk()
window.geometry('400x300')
greeting = Label(text="Hello Emma, Whats going on over there?",bg='green',fg='red')
greeting.pack() #This code adds the widget to the window and sizes it to fit on the window properly
entry = Entry(fg='black', bg='blue', width=40)
entry.pack#adds a widget to the window and tkinter sizes it to fit on the window properly
window.mainloop()