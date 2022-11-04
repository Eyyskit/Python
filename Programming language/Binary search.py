endloop = 0
max = 1000
min = 1
print("Think of a number between 1 and 1000")
print("\nWrite it down! Are you ready? Press Enter.")
input()
guesses = 0

while endloop == 0:
    midpoint = int((max+min)/2)
    print("My guess is",midpoint,"\nPlease enter too high, too low or correct\n")
    reply = input()
    reply = reply.lower()
    guesses+=1

    if reply =="too high":
        max = midpoint - 1
    elif reply =="too low":
        min = midpoint + 1
    elif reply =="correct":
        endloop = 1
        print("I took",guesses,"tries to guess the number")
    else:
        print("Your reply is not recognised")
        guesses-=1
    if guesses>10:
        print("I think you have made mistake somewhere")
        endloop = 1
print("Press Enter to exit")
input()