/*
	Write a program with method multiply(String msg, int... nums) that prints a custom message and the product of numbers passed.
 */
public class Exercise4 {

    void multiply(String msg, int... nums) {
        System.out.println(msg);
        int prod = 1;
        for (int i : nums) {
            prod *= i;
        }
        System.out.println("The Product of numbers is: " + prod);
    }

    public static void main(String[] args) {
        Exercise4 e = new Exercise4();
        e.multiply("This is 0 arg:");
        System.out.println("");
        e.multiply("This is 1 arg:", 6);
        System.out.println("");
        e.multiply("This is 2 arg:", 6, 7);
        System.out.println("");
        e.multiply("This is 3 arg:", 2, 6, 7);
        System.out.println("");
        e.multiply("This is 4 arg:", 6, 7, 2, 4);
        System.out.println("");
        e.multiply("This is 5 arg:", 6, 7, 2, 4, 5);
    }

}
