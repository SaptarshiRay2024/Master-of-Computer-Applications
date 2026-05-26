class Student:
    def __init__(self , name , roll_no , marks):
        self.name=name
        self.roll_no=roll_no
        self.marks=marks
    def display_details(self):
        print("Name : " , self.name)
        print("Roll number : " , self.roll_no)
    def calculate_grade(self):
        if self.marks>=90:
            print("Grade A")
        elif self.marks>=75:
            print("Grade B")
        elif self.marks>=50:
            print("Grade C")
        else:
            print("Fail")
s1=Student(name="student1" , roll_no=34 , marks=85)
s1.display_details()
s1.calculate_grade()
s2=Student(name="student2" , roll_no=51 , marks=60)
s2.display_details()
s2.calculate_grade()
s3=Student(name="student3" , roll_no=27 , marks=75)
s3.display_details()
s3.calculate_grade()
