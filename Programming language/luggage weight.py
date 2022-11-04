#Program to read luggage weight and charge the tax appropriately
weight = int(input("Enter the weight of the luggage in kg:"))

if weight > 50:
    print("Sorry, but we request you pay for the extra luggage your bring aboard")
else:
    print("Thank you, Have a nice flight")