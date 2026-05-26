def quick_sort(arr):
    if len(arr)<=1:
        return arr
    
    pivot=arr[len(arr)//2]
    
    left=[]
    for i in arr:
        if i<pivot:
            left.append(i)
    
    middle=[]
    for i in arr:
        if i==pivot:
            middle.append(i)

    right=[]
    for i in arr:
        if i>pivot:
            right.append(i)

    return quick_sort(left) + middle + quick_sort(right)

#size=int(input("Enter number of elements : "))
data=[0,17,-3,90,-14,0,1,100]
'''for i in range(size):
    n=int(input("Enter element : "))
    data.append(n)'''
print("Original : " , data)
sorted_data = quick_sort(data)
print("Sorted : " , sorted_data)