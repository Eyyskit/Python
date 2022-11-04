class BankAccount:
    def __init__ (self,name):
        self.user_name = name
        self.balance = 500.0

    def show_balance(self):
        print(f"{self.user_name} has a balance of {self.balance} dollars")

    def withdraw_money(self,amount):
        if amount > self.balance:
            print("You don't have sufficient funds in your account")
        else:
            self.balance -= amount
            print(f"{self.user_name} has withdrawn an amount of {amount} dollars")

    def deposit_money(self,amount):
        self.balance += amount
        print(f"{self.user_name} has deposited an amount of {self.balance} dollars")

def main():
    savings_account = BankAccount("Olivia")
    savings_account.deposit_money(1000)
    savings_account.show_balance()
    savings_account.withdraw_money(700)
    savings_account.show_balance()

if __name__ =="__main__":
    main()