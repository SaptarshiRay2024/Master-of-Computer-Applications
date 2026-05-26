def quick_sort(arr):
    swaps = 0
    l = [(0, len(arr) - 1)]
    while l:
        start, end = l.pop()
        if start >= end:
            continue
        pivot = arr[end]
        i = start
        for j in range(start, end):
            if arr[j] <= pivot:
                arr[i], arr[j] = arr[j], arr[i]
                if i != j:
                    swaps += 1
                i += 1
        arr[i], arr[end] = arr[end], arr[i]
        if i != end:
            swaps += 1
        l.append((start, i - 1))
        l.append((i + 1, end))
    return arr, swaps

data=[0,17,-3,90,-14,0,1,100]
print("Original Array : " , data)
sorted_data, total_swaps = quick_sort(data)
print("Sorted Array : " , sorted_data)
print("Total Swaps : " , total_swaps)