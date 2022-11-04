from tkinter import *

window = Tk()
#Below are the dimensions of the window created
window.geometry('800x600')

#Below is the code to add a label to the window.
lb1 = Label(text="Hello Emma, What's going on over there? ", fg="white", bg="red", width=60, height=2)
#lb1.pack()    # This code adds the widget to the window and tkinter sizes it to fit on the window properly
lb1.grid(column=0, row=0)

# Below is the code to add a textbox for data entry
entry = Entry(fg="black", bg="blue", width=40)
entry.grid(column=0, row=1)

def clicked(l1):
    l1.configure(text="Button is clicked..!!")
    return l1

btn = Button(window, text="Clear", bg="green", fg="black", command=clicked)
btn.grid(column=0, row=2)

# combo box
#combo = Combobox(window)
#combo['menu'] = (1, 2, 3, "Harry")
#combo.current(3)
#combo.grid(column=0, row=3)

check_state = BooleanVar()
check_state.set(True)
check = Checkbutton(window, text='Choose', var=check_state, bg='white', fg='black')
check.grid(column=0, row=5)


# 1. Retrieving text using .get()
# 2. Deleting text  using .delete()
# 3. Inserting text using .insert()
'''
 name = entry.get()
 print(name)

 #To delete the first letter of the text typed into the textbox, we could use the code below
name2 = entry.delete(0,len(entry))

#To insert the word "Uganda" into the textbox from the beginning, we could use the code below
name3 = entry.insert(0,"Uganda")
'''
window.mainloop()  # This is the code that tells Python to run the entire set of lines of code a.k.a Tkinter loop.
