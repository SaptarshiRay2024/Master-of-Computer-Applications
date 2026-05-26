s=input("Enter a string : ")
v=['a', 'e' , 'i' , 'o' , 'u']
d=dict()
d1=dict()
for i in s:
    if i in v:
        c=0
        for j in s:
            if i==j:
                c=c+1
        d1={i:c}
        d.update(d1)
print(d)
