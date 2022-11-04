def countDog(y):
    count = 0
    for word in y.lower().split():
        if word == 'dog':
            count = count + 1
    return count

print(countDog("The dog has a dog with a name dog"))