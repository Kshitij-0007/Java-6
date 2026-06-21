/*
	- Write a program using varargs to create a method displayNumbers(int... nums) that prints the numbers passed to it. Call it with:
		- One number
		- Three numbers
		- No numbers
 */
public class Exercise1 {

    void show(int a) {
        System.out.println("{" + a + "}");
    }

    void show(int a, int b) {
        System.out.println("{" + a + "," + b + "}");
    }

    void show(int a, int b, int c) {
        System.out.println("{" + a + "," + b + "," + c + "}");
    }

    public static void main(String[] args) {
        Exercise1 e = new Exercise1();
        e.show(10);
        e.show(10, 20);
        e.show(10, 20, 30);
    }
}
