listOfNames = ["Andrew","John","Adam","Carol"]
file = open("text.rtf","a")
listOfNames.append("Emma")
for name in listOfNames:
    file.write(name+"\n")
file.close()

s = "Hi there Emmanuel!"
print(s.split())