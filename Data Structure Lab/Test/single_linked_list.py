class Node:

    def __init__(self, item):
        self.info=item
        self.next=None

class SlinkedList:

    def __init__(self):
        self.start=None

    def insert_at_last(self, item):
        nd=Node(item)
        if self.start==None:
            self.start=nd
            return
        temp=self.start
        while temp.next!=None:
            temp=temp.next
        temp.next=nd

    def insert_at_beginning(self, item):
        nd=Node(item)
        nd.next=self.start
        self.start=nd

    def insert_at_position(self, item, pos):
        if pos==1:
            self.insert_at_beginning(item)
        else:
            nd=Node(item)
            i=1
            temp=self.start
            while temp.next!=None and i<pos:
                prev=temp
                temp=temp.next
                i=i+1
            if temp.next==None:
                temp.next=nd
                return
            nd.next=temp
            prev.next=nd
    
    def insert_after_specific_item(self, item, specific_item):
        nd=Node(item)
        temp=self.start
        while temp.next!=None and temp.info!=specific_item:
            temp=temp.next
        nd.next=temp.next
        temp.next=nd
    
    def delete_start_node(self):
        temp=self.start
        self.start=temp.next
        del temp

    def delete_last_node(self):
        temp=self.start
        while temp.next!=None:
            prev=temp
            temp=temp.next
        prev.next=None
        del temp
    
    def delete_specific_item(self, item):
        temp=self.start
        prev=None
        if temp==None:
            print("List is empty")
            return
        if temp.info==item:
            self.start=temp.next
            temp=None
            return
        while temp!=None and temp.info!=item:
            prev=temp
            temp=temp.next
        if temp==None:
            print("Item not found in list")
            return
        prev.next=temp.next
        temp=None

    def display(self):
        temp=self.start
        while temp!=None:
            print(temp.info)
            temp=temp.next

l1=SlinkedList()

while(True):
    print("Enter 1 to insert at last \n"
          "Enter 2 to insert at beginning \n"
          "Enter 3 to insert at position \n"
          "Enter 4 to insert after specific item \n"
          "Enter 5 to delete start node \n"
          "Enter 6 to delete last node \n"
          "Enter 7 to delete specific item \n"
          "Enter 8 to display linked list \n"
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
        l1.insert_after_specific_item(item, specific_item)
    elif n==5:
        l1.delete_start_node()
    elif n==6:
        l1.delete_last_node()
    elif n==7:
        item=int(input("Enter value to delete : "))
        l1.delete_specific_item(item)
    elif n==8:
        l1.display()
    else:
        print("Invalid choice")