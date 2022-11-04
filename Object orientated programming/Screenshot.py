class GameElement:
    def __init__(self,position_x,position_y,width,height,filename):
        self.__positionX = position_x
        self.__positionY = position_y
        self.__width = width
        self.__height = height
        self.__ImageFilename = filename

    def positionX(self):
        pass

    def positionY(self):
        pass

    def width(self):
        pass

    def height(self):
        pass

    def ImageFilename(self):
        pass

    def Get_details(self):
        message = "positon_x",self.__position_x,"position_y",self.__position_y,"width",self.__width,"height",self.__height,"Filename",self.__ImageFilename
        return message

class AnimatedElement(GameElement):
    def __init__(self,Direct,Health,Strength,Animation):
        self.__animationFrames = []
        self.__Direction = Direct
        self.__AdjustHealth = Health
        self.__AdjustStrength = Strength
        self.__DisplayAnimation = Animation

    def animationFrames(self):
        pass

    def Direction(self):
        pass

    def AdjustHealth(self):
        pass

    def AdjustStrength(self):
        pass

    def DisplayAnimation(self):
        pass

class Scenery(GameElement):
    def __init__(self,Damage,Points):
        Object.__init__(self,positionX,positionY,width,height,ImageFilename)
        self.__CauseDamage = Damage
        self.__DamagePoints = Points
        GiftBox = Scenery(150,150,50,75,"box.png",True,50)

    def CauseDamage(self):
        if(self._CauseDamage):
            return self.__DamagePoints
        else:
            return 0

    def DamagePoints(self,n):
        pass

def main():


if __name__=="__main__":
    main()