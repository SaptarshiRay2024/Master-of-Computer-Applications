class Student:
    def __init__(self , name , roll , marks):
        self.name=name
        self.roll=roll
        self.marks=marks
    def showdata(self):
        print("Name : " , self.name)
        print("Roll number : " , self.roll)
    def showmarks(self):
        print("Marks : " , self.marks)
s1=Student(name="Student1" , roll=34 , marks=75)
s1.showdata()
s1.showmarks()
