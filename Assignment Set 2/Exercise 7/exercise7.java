/*
 -Write a program to calculate an electricity bill using Object-Oriented Programming.
  Create a class named Bill that:
                   - Has a constructor which accepts the number of electricity units consumed.
				   - Calculates the total bill amount based on the following slab rates:
							- ₹3 per unit for the first 100 units
							- ₹5 per unit for the next 100 units (101–200)
							- ₹10 per unit for units above 200

 -The class should also have a method named display() to print:
		- Units consumed
		- Total bill amount

 -In the main program:
 -Create at least three objects of the Bill class with different unit values (e.g., 80, 150, 250).
 -Call the display() method for each object.
 */
class Bill {

    int units;
    double totalBill;

    Bill(int u) {
        units = u;

        if (units <= 100) {
            totalBill = units * 3;
        } else if (units <= 200) {
            totalBill = (100 * 3) + ((units - 100) * 5);
        } else {
            totalBill = (100 * 3) + (100 * 5) + ((units - 200) * 10);
        }
    }

    void display() {
        System.out.println("Units Consumed: " + units);
        System.out.println("Total Bill Amount: ₹" + totalBill);
        System.out.println();
    }
}

public class exercise7 {

    public static void main(String[] args) {

        Bill b1 = new Bill(80);
        Bill b2 = new Bill(150);
        Bill b3 = new Bill(250);

        b1.display();
        b2.display();
        b3.display();
    }
}
