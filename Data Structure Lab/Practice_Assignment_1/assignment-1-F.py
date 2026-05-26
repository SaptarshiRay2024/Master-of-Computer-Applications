def third_smallest():
    n=int(input("Enter number of elements : "))
    l=[]
    for i in range(n):
        print("Enter element" , i+1 , ": " , end="")
        e=int(input())
        l.append(e)
    for i in range(1,len(l)):
        for j in range(len(l)-i):
            if l[j]>l[j+1]:
                x=l[j]
                l[j]=l[j+1]
                l[j+1]=x
    return l[2]
print("Third smallest element :" , third_smallest())
