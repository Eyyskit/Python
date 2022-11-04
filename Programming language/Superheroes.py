heroes = ["Batman","Wonder Woman","Superman","Spiderman"]
print("Current pilot:",heroes[0])
print("Co-pilot:",heroes[1])
heroes[2] = "Hit Girl"
heroes.append("Superboy")
heroes.append("Cat woman")
print(heroes)

choice = int(input("Enter the number of the hero you want to change(0-5):"))
newSuperhero = input("Name of the new superhero: ")
heroes[choice]= newSuperhero
print(heroes)