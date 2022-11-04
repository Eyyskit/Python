class Football:
    def __init__(self,country,division,no_of_times):
        self.country = country
        self.division = division
        self.no_of_times = no_of_times

    def fifa(self):
        print(f"{self.country} national football team is placed in '{self.division}' FIFA division")

class WorldChampions(Football):
    def world_championship(self):
        print(f"{self.country} national football team is {self.no_of_times} times world champions")

def main():
    germany = WorldChampions("Germany","UEFA",4)
    germany.fifa()
    germany.world_championship()

if __name__=="__main__":
    main()