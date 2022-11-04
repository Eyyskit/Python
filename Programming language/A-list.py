list = ["Arizona","LSU","Clemson"]
list_2 = [1,2,4,6,9,7,3,5,78]
Op_s = ["macOS","windows","linux"]
list.extend(list_2)
print(sorted(list_2,reverse = True))#sorted is used to sort the list from ascending.
print(Op_s.index("linux"))#index is used to find the positions of the item


import keyword
print(help(keyword))