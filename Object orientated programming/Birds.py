class birds:
    def __init__ (self , birdname):
        self.birdname = birdname
    def flyingbirds (self):
        print(f"{self.birdname}, They fly above the clouds")
    def non_flyingbirds (self):
        print(f"{self.birdname}, They dont fly for so long")

def main():
    vulture = birds("Scavenger bird")
    chicken = birds("Domestic bird")
    crane = birds("Crested crane")
    vulture.flyingbirds()
    chicken.non_flyingbirds()
    crane.flyingbirds()
if __name__ =="__main__":
    main()
