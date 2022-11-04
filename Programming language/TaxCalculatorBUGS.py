#Tax Calculator with 5 bugs

salary = int(input("Please enter your annual salary: £"))

if salary < 30000:
#Salaries under 30000 are taxed at 20%
    tax = salary * 0.2
elif salary <= 30000:
#Salaries over 30000 are taxed at 40% for anything over 30000
    salary = salary - 30000
    tax = salary * 0.4 + 6000
else:
#Salaries over 150000 are taxed at 45% for anything over 150000
    salary = salary - 150000
    tax = salary * 0.45 + 6400 + 48000
print("Earnings of £",salary,"will attract taxes of £",round(tax,2))
input("Press ENTER to quit")

