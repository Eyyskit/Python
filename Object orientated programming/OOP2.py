import math
class ArcLength:
    def __init__ (self):
        self.angle = 0
        self.angle = 0
    def calculate_arc_length(self):
        result = 2*math.pi*self.radius*self.angle/360
        print(f"Length of an Arc is {result}")
al = ArcLength()
al.radius = 9
al.angle = 75
print(f"Angle is {al.angle}")
print(f"Radius is {al.radius}")
al.calculate_arc_length()





