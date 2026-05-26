class Stack:
    def __init__(self):
        self.stk=[0]*8
        self.top=-1
    def push(self, item):
        size=len(self.stk)
        if self.top==size-1:
            print("Stack overflow")
        else:
            self.top=self.top+1
            self.stk[self.top]=item
    def pop(self):
        if self.top==-1:
            print("Stack empty")
        else:
            print(self.stk[self.top])
            self.top=self.top-1
    def display(self):
        print(self.stk[0 : self.top+1])
s1=Stack()
for i in range(8):
    s1.push(i)
s1.display()
s1.pop()
s1.push(8)
s1.push(9)
s1.display()