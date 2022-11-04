class Collinear:
    def __init__(self,x,y):
        self.x_cord = x
        self.y_cord = y

    def check_for_collinear(self,point_2,point_3):
        if(point_3.y_cord - point_2.y_cord)*(point_2.x_cord - self.x_cord) == (point_2.y_cord - self.y_cord)*(point_3.x_cord - point_2.x_cord):
            print("The points are collinear")
        else:
            print("The points aren't collinear")

def main():
    point_1 = Collinear(1,1)
    point_2 = Collinear(2,2)
    point_3 = Collinear(3,3)
    point_1.check_for_collinear(point_2,point_3)

if __name__=="__main__":
    main()