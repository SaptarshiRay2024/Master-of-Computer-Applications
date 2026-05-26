class Queue:
    def __init__(self):
        self.que=[0]*8
        self.rear=-1
        self.front=-1
    def push(self, item):
        size=len(self.que)
        if self.front==size-1:
            print("Queue is full")
        else:
            self.front=self.front+1
            self.que[self.front]=item
            if self.rear==-1:
                self.rear=0
    def pop(self):
        if self.front==-1 and self.rear==-1:
            print("Queue is empty")
        else:
            print(self.que[self.rear])
            if self.front==self.rear:
                self.front=-1
                self.rear=-1
            else:
                self.rear=self.rear+1
    def display(self):
        print(self.que[0 : self.front+1])
q1=Queue()
for i in range(8):
    q1.push(i)
q1.display()
for i in range(8):
    q1.pop()
for i in range(9,17):
    q1.push(i)
q1.display()