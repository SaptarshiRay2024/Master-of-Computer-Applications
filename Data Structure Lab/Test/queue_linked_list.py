class Node:

    def __init__(self, item):
        self.info=item
        self.next=None

class QueueLinkedList:

    def __init__(self):
        self.rear=None
        self.front=None

    def insertion(self, item):
        nd=Node(item)
        if self.front==None and self.rear==None:
            self.front=nd
            self.rear=nd
            return
        self.rear.next=nd
        self.rear=nd

    def deletion(self):
        if self.front==None and self.rear==None:
            print("Queue is empty")
            return
        temp=self.front
        item=temp.info
        if self.front==self.rear:
            self.front=None
            self.rear=None
        else:
            self.front=self.front.next
        del temp
        return item
    
    def display(self):
        temp=self.front
        while temp!=None:
            print(temp.info)
            temp=temp.next

l1=QueueLinkedList()

print("Deletion when empty")
l1.deletion()

i=1
while i<=5:
    l1.insertion(i)
    i+=1

print("After insertion")
l1.display()

l1.deletion()
l1.deletion()

print("After deletion")
l1.display()

l1.insertion(8)
l1.insertion(9)

print("After second insertion")
l1.display()