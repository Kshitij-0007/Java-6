/*
	-Create a class Laptop with company name, model, and price. 
	-Overload constructors to initialize:
								- Only company name
								- Company name + model
								- Company name + model + price
 */

class Laptop {

    String companyName;
    String model;
    double price;

    Laptop(String c) {
        companyName = c;
        model = "Not Available";
        price = 0;
    }

    Laptop(String c, String m) {
        companyName = c;
        model = m;
        price = 0;
    }

    Laptop(String c, String m, double p) {
        companyName = c;
        model = m;
        price = p;
    }

    void display() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println();
    }
}

public class exercise4 {

    public static void main(String[] args) {

        Laptop l1 = new Laptop("Dell");
        Laptop l2 = new Laptop("HP", "Pavilion");
        Laptop l3 = new Laptop("Asus", "Tuf A16", 110000);

        l1.display();
        l2.display();
        l3.display();
    }
}
