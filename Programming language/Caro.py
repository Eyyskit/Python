def findCaro(y):
    count = 0
    for name in y.lower().split():
        if name == "caro":
            count = count + 1
    return count

print(findCaro("Caro has a daughter called caro and her daughter wants to name her kids caro"))