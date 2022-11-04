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
