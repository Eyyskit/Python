def bubbleSort( theSeq ):
    n = len( theSeq )

    for i in range( n-1 ):
        flag = 0

        for j in range( n-1 ):

            if theSeq[j] > theSeq[j+1]:
                tmp = theSeq[j]
                theSeq[j] = theSeq[j+1]
                theSeq[j+1] = tmp
                flag = 1

        if flag == 0:
            break

    return theSeq

K1 = [32,45,2,15,50]
#Below is the code for callin the bubble sort function
result = bubbleSort(K1)
print (result)