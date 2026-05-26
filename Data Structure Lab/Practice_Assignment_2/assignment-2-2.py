class BankAccount:
    def __init__(self , account_holder , balance):
        self.account_holder=account_holder
        self.balance=balance
    def deposit(self):
        amount=int(input("Enter amount to deposit : "))
        self.balance=self.balance+amount
        print(f"Amount deposited : {amount}")
        print(f"Balance after deposit : {self.balance}")
    def withdraw(self):
        amount=int(input("Enter amount to withdraw : "))
        self.balance=self.balance-amount
        print(f"Amount withdrawn : {amount}")
        print(f"Balance after withdrawal : {self.balance}")
    def display_balance(self):
        print(f"Balance : {self.balance}")
a=BankAccount(account_holder=1001 , balance=50000)
a.deposit()
a.withdraw()
a.display_balance()
b=BankAccount(account_holder=1002 , balance=60000)
b.deposit()
b.withdraw()
b.display_balance()
c=BankAccount(account_holder=1003 , balance=70000)
c.deposit()
c.withdraw()
c.display_balance()
'''print("Enter 1 to deposit.")
print("Enter 2 to withdraw.")
print("Enter 3 to display balance.")
choice=int(input("Enter your choice : "))
if choice==1:
    a.deposit()
elif choice==2:
    a.withdraw()
elif choice==3:
    a.display_balance()
else:
    print("Choice is invalid.")'''
