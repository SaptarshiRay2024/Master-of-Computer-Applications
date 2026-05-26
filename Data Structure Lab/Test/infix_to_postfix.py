def precedence(op):
    if op=="+" or op=="-":
        return 1
    elif op=="*" or op=="/":
        return 2
    elif op=="^":
        return 3

stack=[]
infix="5+10-2*3"
postfix=""
l=["+","-","*","/","^"]
for i in infix:
    if i not in l:
        postfix+=i
    else:
        n=len(stack)-1
        op=stack[n]
        if precedence(i) > precedence(op):
            stack.append(i)
        else:
            while precedence(i) <= precedence(op):
                stack.pop()
                n=n-1
                if n==0:
                    break
                op=stack[n]
                stack.append(op)