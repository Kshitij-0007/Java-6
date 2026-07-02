/*
			Local Inner Class in Loop – Multiplication Table
	- Create a class Table with a method printTable(int n).
	- Inside a loop, define a local inner class Multiply that prints multiplication results (n * i).
 */
class Table {

    void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            final int num = i;

            class Multiply {
                void display() {
                    System.out.println(n + " x " + num + " = " + (n * num));
                }
            }

            Multiply m = new Multiply();
            m.display();
        }
    }
}

public class Exercise4 {
    public static void main(String[] args) {
        Table t = new Table();
        t.printTable(5);
    }
}