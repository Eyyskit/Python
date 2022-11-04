class Student:
    def __init__(self,student_name,DOB):
        self.__student_name = student_name
        self.__DOB = DOB

    def Showstudent_name(self):
        pass

class Full_Time_Student(Student):
    def __init__(self):
        self.address = "address"

    def address(self):
        pass

class Part_Time_student(Student):
    def __init__(self):
        self.fee = 500
        self.courses = "course"

    def fee(self):
        pass

    def balance(self,fee,amount):
        balance = fee - amount
        print(f"Your balance is {balance}")

    def courses(self):
        pass

def main():
    address = int(input("Please enter the address"))
    print(f"The address of the student is {address}")
