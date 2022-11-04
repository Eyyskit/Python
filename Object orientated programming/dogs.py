class Dog:
    def __init__(self,breed="German Sheperd",color="Tan Black"):
        self.breed = breed
        self.color = color

    def dog_breed(self):
        print(f"Dog Breed is {self.breed}")

    def dog_color(self):
        print(f"Dog Color is {self.color}")

def main():
    babloo = Dog()
    babloo.dog_breed()
    babloo.dog_color()

if __name__=="__main__":
    main()