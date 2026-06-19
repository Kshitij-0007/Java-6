/*

    Create a class Student having variables:
	- name
	- RollNo
	- age
	
	- Create 3 objects of  class "Student".
	- assign  values for class members. 
    - Create 2 objects using Parameterized constructor
    - create 1 object using Default constructor. 
 
    - Display if the student is applicable for Leadership  


 */
class Student {

    String name;
    int rollNo;
    int age;

    Student() {
        name = "Rahul";
        rollNo = 103;
        age = 19;
    }

    Student(String n, int r, int a) {
        name = n;
        rollNo = r;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Age: " + age);

        if (age >= 18) {
            System.out.println("Applicable for Leadership");
        } else {
            System.out.println("Not Applicable for Leadership");
        }

        System.out.println();
    }
}

public class exercise1 {

    public static void main(String[] args) {

        Student s1 = new Student("Karan", 101, 20);
        Student s2 = new Student("Riya", 102, 17);
        Student s3 = new Student();

        s1.display();
        s2.display();
        s3.display();
    }
}
