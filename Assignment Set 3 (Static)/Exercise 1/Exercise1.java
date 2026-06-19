

/*
     	 
	- Create class "MathOperations1" with following member : 
        - Static counter: to track the no. of time a static method is called.
        - static int add(int a, int b):  sums two numbers and increments counter
		- int multiply(int a, int b): Returns the product of two numbers
		
	- Create another class "MathOperations2"	
	    - call add() twice and display counter 
		- Use an instance to call multiply() after the call add()
		- Display updated counter. 
		
 */
class MathOperations1 {

    static int counter = 0;

    static int add(int a, int b) {
        counter += 1;
        return a + b;
    }

    static int multiply(int a, int b) {
        counter++;
        return a * b;
    }
}

public class Exercise1 {

    public static void main(String[] args) {
        int sum = MathOperations1.add(2, 3);
        System.out.println("The sum :" + sum);
        System.out.println("The counter :" + MathOperations1.counter);
        System.out.println("");
        sum = MathOperations1.add(4, 6);
        System.out.println("The sum :" + sum);
        System.out.println("The counter :" + MathOperations1.counter);
        System.out.println("");
        int multiply = MathOperations1.multiply(4, 6);
        System.out.println("The multiplication :" + multiply);
        System.out.println("The counter :" + MathOperations1.counter);
    }
}
