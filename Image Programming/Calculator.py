from tkinter import *

def click_function():
    my_label.config(text=symbol.get())

window = Tk()
window.title('My Calculator')

my_label = Label(window, width=2, height=1, text='')
my_label.grid(row=0, column=0)

Label(window,text='').grid(row=0,column=0)
my_text_box = Entry(window,width=15, fg="white", bg="black")
my_text_box.grid(row=0,column=1)

my_button = Button(window,text=1,width=5,command = click_function)
my_button.grid(row=1,column=0)
my_button = Button(window,text=2,width=5,command = click_function)
my_button.grid(row=1,column=1)
my_button = Button(window,text=3,width=5,command = click_function)
my_button.grid(row=1,column=2)
my_button = Button(window,text=4,width=5,command = click_function)
my_button.grid(row=2,column=0)
my_button = Button(window,text=5,width=5,command = click_function)
my_button.grid(row=2,column=1)
my_button = Button(window,text=6,width=5,command = click_function)
my_button.grid(row=2,column=2)
my_button = Button(window,text=7,width=5,command = click_function)
my_button.grid(row=3,column=0)
my_button = Button(window,text=8,width=5,command = click_function)
my_button.grid(row=3,column=1)
my_button = Button(window,text=9,width=5,command = click_function)
my_button.grid(row=3,column=2)
my_button = Button(window,text=0,width=5,command = click_function)
my_button.grid(row=4,column=1)
multiply = Button(window,text="*",width=5,command = click_function)
multiply.grid(row=2,column=4)
add = Button(window,text="+",width=5,command = click_function)
add.grid(row=1,column=4)
subtract = Button(window,text="-",width=5,command = click_function)
subtract.grid(row=2,column=5)
divide = Button(window,text="/",width=5,command = click_function)
divide.grid(row=1,column=5)
equals = Button(window,text="=",width=5,command = click_function)
equals.grid(row=3,column=4)
clear = Button(window,text="clear",width=5,command = click_function)
clear.grid(row=3,column=5)



symbol = StringVar()

numA = int(input("Enter your first number: "))
numB = int(input("Enter your second number: "))
operator = input("Choose your operator,(+,-,/,*): ")

if operator == "+":
    print(str(numA),operator,str(numB)+" = "+str(numA + numB))

elif operator == "-":
    print(str(numA),operator,str(numB)+" = "+str(numA - numB))

elif operator == "/":
    print(str(numA),operator,str(numB)+" = "+str(numA / numB))

elif operator == "*":
    print(str(numA),operator,str(numB)+" = "+str(numA * numB))

else:
    print("Invalid Operation")


window.mainloop()