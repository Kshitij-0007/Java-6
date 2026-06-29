/*
    Create class "Student"
	- Overload the method addScores() 
    - One method should accepts a list of integers which represents the scores from multiple tests
	- another method accepts single integer which represents total score of student from all tests
	- Implement this methods to display total score of student.   
    - Write a test case where some students provide multiple scores and other provides only total score. 
    - Note: Explore method overloading with variable length arguments and see how java handles var args in overloading method.
 */
class Student {

    void addScores(int total) {
        System.out.println("Total Score: " + total);
    }

    void addScores(int... scores) {
        int sum = 0;
        for (int i : scores) {
            sum += i;
        }
        System.out.println("Total Score: " + sum);
    }
}

public class Exercise2 {

    public static void main(String[] args) {
        Student s = new Student();
        s.addScores(85);
        s.addScores(20, 25, 18, 30);
        s.addScores(15, 20, 25);
    }
}
