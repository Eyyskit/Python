import random

randomNum = random.randint(1,4)
print(randomNum)

def chooseASuit(number):
    if number == 1:
        suit = "Hearts"
    elif number == 2:
        suit = "Diamonds"
    elif number == 3:
        suit = "Clubs"
    else:
        suit = "Spades"
    return suit

def ChooseACard(CardValue):
    if CardValue == 1:
        card = "Ace"
    elif CardValue == 11:
        card = "Jack"
    elif CardValue == 12:
        card = "Queen"
    elif CardValue == 13:
        card = "King"
    else:
        card = CardValue
    return card

for counter in range(10):
    randomNum1 = random.randint(1,4)
    suit = chooseASuit(randomNum1)

    randomNum = random.randint(1,13)
    card = ChooseACard(randomNum)

    print("Your card is",card,"of",suit)


