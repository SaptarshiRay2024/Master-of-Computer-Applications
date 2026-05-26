class Node:

    def __init__(self, item):
        self.info=item
        self.left=None
        self.right=None

class BinarySearchTree:

    def __init__(self):
        self.root=None

    def insertion(self, item):
        nd=Node(item)
        if self.root==None:
            self.root=nd
            return
        temp=self.root
        while temp!=None:
            if item<temp.info:
                par=temp
                temp=temp.left
            else:
                par=temp
                temp=temp.right
        if item<par.info:
            par.left=nd
        else:
            par.right=nd
            
def inorder(nd):
    if nd!=None:
        inorder(nd.left)
        print(nd.info)
        inorder(nd.right)

l1=BinarySearchTree()

l1.insertion(100)
l1.insertion(50)
l1.insertion(30)
l1.insertion(150)
l1.insertion(80)
l1.insertion(170)
l1.insertion(120)
l1.insertion(140)