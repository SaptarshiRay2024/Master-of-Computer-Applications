#Incomplete
nums1=[4,1,2]
nums2=[1,3,4,2]
nums3=[]
sub=True
for i in nums1:
    if i not in nums2:
        sub=False
        break
if sub==False:
    print("nums1 is not a subset of nums2")
else:
    for i in range(len(nums1)):
        flag=False
        for j in range(len(nums2)):
            if nums1[i]==nums2[j]:
                for k in range(j+1,len(nums2)):
                    if nums1[i]<nums2[k]:
                        nums3.append(nums2[k])
                        flag=True
                        break
                break
        if flag==False:
            nums3.append(-1)
print(nums3)
