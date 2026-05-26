class Node:

    def __init__(self, item):
        self.info=item
        self.next=None

class ClinkedList:

    def __init__(self):
        self.start=None
    
    def insert_at_last(self, item):
        nd=Node(item)
        if self.start==None:
            self.start=nd
            nd.next=self.start
            return
        temp=self.start
        while temp.next!=self.start:
            temp=temp.next
        temp.next=nd
        nd.next=self.start

    def insert_at_beginning(self, item):
        nd=Node(item)
        nd.next=self.start
        temp=self.start
        while temp.next!=self.start:
            temp=temp.next
        temp.next=nd
        self.start=nd

    def insert_at_position(self, item, pos):
        if pos==1:
            self.insert_at_beginning(item)
        else:
            nd=Node(item)
            i=1
            temp=self.start
            while temp.next!=self.start and i<pos:
                prev=temp
                temp=temp.next
                i=i+1
            if temp.next==self.start:
                temp.next=nd
                nd.next=self.start
                return
            nd.next=temp
            prev.next=nd
    
    def insert_after_item(self, item, specific_item):
        nd=Node(item)
        temp=self.start
        while temp.next!=self.start and temp.info!=specific_item:
            temp=temp.next
        if temp.next==self.start:
            temp.next=nd
            nd.next=self.start
            return
        nd.next=temp.next
        temp.next=nd
    
    def delete_last(self):
        if self.start==None:
            print("List is empty")
            return
        temp=self.start
        while temp.next!=self.start:
            prev=temp
            temp=temp.next
        prev.next=self.start
        del temp
    
    def delete_first(self):
        if self.start==None:
            print("List is empty")
            return
        temp1=self.start
        temp2=self.start
        while temp2.next!=self.start:
            temp2=temp2.next
        temp2.next=temp1.next
        self.start=temp1.next
        del temp1
    
    def delete_by_position(self, pos):
        if self.start==None:
            print("List is empty")
            return
        if pos==1:
            self.delete_first(item)
        else:
            nd=Node(item)
            i=1
            temp=self.start
            while temp.next!=self.start and i<pos:
                prev=temp
                temp=temp.next
                i=i+1
            if temp.next==self.start:
                temp.next=nd
                nd.next=self.start
                return
            nd.next=temp
            prev.next=nd
    
    def delete_by_item(self, item):
        if self.start==None:
            print("List is empty")
            return
        temp=self.start
        prev=None
        if temp.info==item:
            self.start=temp.next
            temp=None
            return
        while temp!=self.start and temp.info!=item:
            prev=temp
            temp=temp.next
        if temp==self.start:
            print("Item not found in list")
            return
        prev.next=temp.next
        temp=None

    def display(self):
        temp=self.start
        while temp!=self.start:
            print(temp.info)
            temp=temp.next

l1=ClinkedList()

while(True):
    print("Enter 1 to insert at last \n"
          "Enter 2 to insert at beginning \n"
          "Enter 3 to insert at position \n"
          "Enter 4 to insert after specific item \n"
          "Enter 5 to delete last node \n"
          "Enter 6 to delete first node \n"
          "Enter 7 to delete by position \n"
          "Enter 8 to delete specific item \n"
          "Enter 9 to display linked list \n"
          "Enter 0 to exit")
    n=int(input("Enter your choice : "))
    if n==0:
        break;
    elif n==1:
        item=int(input("Enter value to insert : "))
        l1.insert_at_last(item)
    elif n==2:
        item=int(input("Enter value to insert : "))
        l1.insert_at_beginning(item)
    elif n==3:
        item=int(input("Enter value to insert : "))
        pos=int(input("Enter position : "))
        l1.insert_at_position(item, pos)
    elif n==4:
        item=int(input("Enter value to insert : "))
        specific_item=int(input("Enter specific item : "))
        l1.insert_after_item(item, specific_item)
    elif n==5:
        l1.delete_last()
    elif n==6:
        l1.delete_first()
    elif n==8:
        item=int(input("Enter value to delete : "))
        l1.delete_by_item(item)
    elif n==9:
        l1.display()
    else:
        print("Invalid choice")
