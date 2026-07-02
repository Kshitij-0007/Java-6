/*
			Static Nested Class – Student & Marks
	- Create a class Student with a static nested class Marks.
	- Marks should store subject and score.
	- Add a method display() to print subject and score.
	- In main(), create multiple Student.Marks objects and display them.
 */
class Student {

    static class Marks {

        String subject;
        int score;

        Marks(String subject, int score) {
            this.subject = subject;
            this.score = score;
        }

        void display() {
            System.out.println("Subject: " + subject);
            System.out.println("Score: " + score);
        }
    }
}

public class Exercise1 {

    public static void main(String[] args) {
        Student.Marks m1 = new Student.Marks("Maths", 90);
        Student.Marks m2 = new Student.Marks("Science", 85);
        Student.Marks m3 = new Student.Marks("English", 95);

        m1.display();
        m2.display();
        m3.display();
    }
}
