/*
    Create class "Student" with following variables: 
	   - name
	   - RollNo
	   - grade
	   - age
	- Write a method to store & print the correct grade formate for each students. 
    - Create an object to call that method using different format that getGrade()
      which having different parameters eg. Character, string, integer. 	
 */
class Student {

    String name;
    int RollNo;
    String grade;
    int age;

    Student(String name, int RollNo, int age) {
        this.name = name;
        this.RollNo = RollNo;
        this.age = age;
    }

    void getGrade(char g) {
        grade = String.valueOf(g);
        System.out.println("Grade: " + grade);
    }

    void getGrade(String g) {
        grade = g;
        System.out.println("Grade: " + grade);
    }

    void getGrade(int marks) {
        if (marks >= 90) {
            grade = "A";
        } else if (marks >= 75) {
            grade = "B";
        } else if (marks >= 60) {
            grade = "C";
        } else if (marks >= 40) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Grade: " + grade);
    }
}

public class Exercise1 {

    public static void main(String[] args) {
        Student s = new Student("Kshitij", 101, 20);
        s.getGrade('A');
        s.getGrade("B+");
        s.getGrade(82);
    }
}
