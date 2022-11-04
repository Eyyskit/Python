name = "Emmanuel"
age = 18
print("Hello guys, my name is {} and i am {} years old".format(name,age))


a =list(range(3,31,3))
print("list a:",a)
b=[]
'''
for item in a:
    b.append(item*10)
print("list b:",b)
'''

#Alternatively
b=[(item*10) for item in a]
print("list b:",b)