class Node:

    def __init__(self, item):
        self.info=item
        self.next=None
        self.prev=None

class DlinkedList:

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
        nd.prev=temp
