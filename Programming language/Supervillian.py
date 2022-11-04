villains =["The joker","Magneto","Red Mist","Doc Ock"]
for counter in range(4):
    wages = [21,17,3,5]
    print(villains[counter],":£",wages[counter],"million")
totalWage = 0
for counter in range(4):
    totalWage = totalWage + wages[counter]
print("The total wage bill for the league is",totalWage,"millions")