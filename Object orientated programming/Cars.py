class cars:
    def __init__(self,car_name):
        self.cars = car_name
        self.price = 600000

    def show_paid(self,amount):
        if amount > self.price:
            balance = amount - self.price
            print(f"A {self.cars} has been purchased and your balance is {balance} \nPlease enjoy the ride and stay safe")
        else:
            print("You don't have enough money to complete this purchase")

def main():
    racing_cars = cars("ferrari")
    racing_cars.show_paid(950000)

if __name__ =="__main__":
    main()

