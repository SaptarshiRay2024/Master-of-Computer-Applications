class Node:

    def __init__(self, item):
        self.info=item
        self.next=None

class StackLinkedList:

    def __init__(self):
        self.start=None
        self.top=None
    
    def push(self, item):
        nd=Node(item)
        if self.start==None and self.top==None:
            self.start=nd
            self.top=nd
            return
        self.top.next=nd
        self.top=nd
    
    def pop(self):
        if self.top==None:
            print("Stack is empty")
            return
        temp=self.start
        while temp.next!=None:
            prev=temp
            temp=temp.next
        prev.next=None
        del temp
        self.top=prev

    def display(self):
        temp=self.start
        while temp!=None:
            print(temp.info)
            temp=temp.next

l1=StackLinkedList()

print("Pop when empty")
l1.pop()

i=1
while i<=5:
    l1.push(i)
    i+=1

print("After push operation")
l1.display()

l1.pop()
l1.pop()

print("After pop operation")
l1.display()

l1.push(8)
l1.push(9)

print("After second push operation")
l1.display()