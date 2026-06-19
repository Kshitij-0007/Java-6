/*
Exercise 2.

Create a class “Verification”, in which assign a value to an integer variable and check whether the value is greater than 100. 
Create an object of class “Example_1” which prints “The number num1 is greater than 100” if the number is greater than 100, and “The number num1 is less than 100” if the number is less than 100.  

 */
class Verification {

    int num1;

    public void display() {
        if (num1 > 100) {
            System.out.println("The Number is greater than 100\nNumber is : " + num1);
            return;
        }
        System.out.println("The Number is less than or equal to 100\nNumber is : " + num1);
    }
}

public class exercise2 {

    public static void main(String[] args) {
        Verification v1 = new Verification();
        v1.num1 = 150;
        v1.display();
        Verification v2 = new Verification();
        v2.num1 = 50;
        v2.display();
    }
}
