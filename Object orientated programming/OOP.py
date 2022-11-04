class Account():
    def __init__ (self, accountNumber, openingDate, currentBalance, interestRate):
        self.accountNumber = accountNumber
        self.openingDate = openingDate
        self.currentBalance = currentBalance
        self.interestRate = interestRate
    def getAccountNumber(self):
        return self.accountNumber

    def getCurrentBalance(self):
        return self.currentBalance

    def addInterest(self):
        interest = self.currentBalance * self.interestRate
        self.currentBalance += interest

    def setInterestRate(self, interestRate):
        self.interestRate = interestRate

