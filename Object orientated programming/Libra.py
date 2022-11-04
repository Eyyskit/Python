class StockItem:
    def __init__(self,title,date,loan):
        self.__Title = title
        self.__Date = date
        self.__loan = loan

    def ShowTitle(self):
        print(f"The name of this book is {self.__Title} and was acquired on {self.__Date}. Does it have a loan? \n{self.__loan}")

    def Date(self):
        pass

    def loan(self):
        pass


class Books(StockItem):
    def __init__(self,author,IS):
        self.__author = author
        self.__ISBN = IS

    def ShowAuthor(self):
        pass

    def ISBN(self):
        pass


class CDs(StockItem):
    def __init__(self,artist,time):
        self.__artist = artist
        self.__playTime = time

    def artist(self):
        pass

    def playTime(self):
        pass


def main():
    Oliver = StockItem("Oliver Twist","Wednesday","YES")
    Oliver.ShowTitle()


if __name__ =="__main__":
    main()

