/*
              Exercise 4

Create a class "Cube" in which declare variable 'N'.  
Create an object of class "Cube" which displays the sum of cube of N digits.			  

 */
class Cube {

    int n;

    public void displaySumOfCube() {
        int sumOfCube = 0;
        for (int i = 1; i <= n; i++) {
            sumOfCube += (i * i * i);
        }
        System.out.println("The sum of the Cube of digits is: " + sumOfCube);
    }
}

public class exercise4 {

    public static void main(String[] args) {
        Cube c = new Cube();
        c.n = 5;
        c.displaySumOfCube();
    }
}
