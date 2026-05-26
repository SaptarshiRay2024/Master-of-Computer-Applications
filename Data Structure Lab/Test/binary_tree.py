class Node:
    def __init__(self, item):
        self.item=item
        self.left=None
        self.right=None

def postorder(root):
    if root:
        postorder(root.left)
        postorder(root.right)
        print(root.item, end=" ")

def inorder(root):
    if root:
        inorder(root.left)
        print(root.item, end=" ")
        inorder(root.right)

def preorder(root):
    if root:
        print(root.item, end=" ")
        preorder(root.left)
        preorder(root.right)

root=Node(1)
root.left=Node(2)
root.right=Node(3)
root.left.left=Node(4)
root.left.right=Node(5)

print("Preorder Traversal : ", end=" ")
preorder(root)
print()
print("Inorder Traversal : ", end=" ")
inorder(root)
print()
print("Postorder Traversal : ", end=" ")
postorder(root)