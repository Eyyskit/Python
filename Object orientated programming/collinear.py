class Collinear:
    def __init__(self,x,y):
        self.x_coord = x
        self.y_coord = y

    def check_for_collinear(self,point_2,point_3):
        if(point_3.y_coord - point_2.y_coord)*(point_2.x_coord - self.x_coord) == (point_2.y_coord - self.y_coord)*(point_3.x_coord - point_2.x_coord):
            print("Points are collinear")
        else:
            print("Points are not collinear")

def main():
    point_1 = Collinear(1,1)
    point_2 = Collinear(2,2)
    point_3 = Collinear(3,3)
    point_1.check_for_collinear(point_2,point_3)

if __name__=="__main__":
    main()