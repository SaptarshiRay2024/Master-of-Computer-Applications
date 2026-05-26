def string_repeat():
    s=input("Enter a string : ")
    s1=""
    r=""
    for i in s:
        if i==r:
            s1=s1+"*"
        else:
            s1=s1+i
        r=i
    return s1
print("New string : " , string_repeat())
