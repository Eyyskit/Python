valid=False
while valid==False:
    print("Please enter your mobile phone number without the(+):")
    mobileNumber=input()
    if len(mobileNumber)==13 and mobileNumber.isdigit()==True:
        print("Correct mobile phone number length")
        valid=True
    else:
        print("Incorrect mobile phone number length")
        print("Please try again")
        valid=False
        break