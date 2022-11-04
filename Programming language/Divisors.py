num = int(input("Enter the number: "))
for count in range(1,num+1):
    Quotient = num%count
    if Quotient == 0:
        print(count,"",end='')



