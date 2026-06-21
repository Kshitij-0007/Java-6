/*
			Static Initialization Order Problem
Problem:
	- Create a class with:
	- Static variable a initialized to 10.
	- Static block that prints a and then changes it to 20.
	- Another static block that prints a.
	- A static method that prints a.
	- Call the static method and observe the order of outputs.
 */
public class Exercise8 {

    static int a = 10;

    static {
        System.out.println("Static block 1  a: " + a);
        a = 20;
    }

    static {
        System.out.println("Static block 2  a: " + a);
    }

    static void show() {
        System.out.println("Static method  a: " + a);
    }

    public static void main(String[] args) {
        show();
    }
}
