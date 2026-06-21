/*
	- Write a program using varargs to create a method displayNumbers(int... nums) that prints the numbers passed to it. Call it with:
		- One number
		- Three numbers
		- No numbers
 */
public class Exercise1 {

    void show(int... a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Exercise1 e = new Exercise1();
        e.show(10);
        System.out.println("");
        e.show(10, 20);
        System.out.println("");
        e.show(10, 20, 30);
        System.out.println("");
    }
}
