/*
	- Create a class Laptop with data members: brand, ramSize, and processor.
	- Define a parameterized constructor to initialize the values.
	- Define a method showSpecs() to display laptop specifications.

In the main method, 
	- create at least two Laptop objects with different values
	using the parameterized constructor and display their details.

 */
class Laptop {

    String brand;
    int ramSize;
    String processor;

    Laptop(String b, int r, String p) {
        brand = b;
        ramSize = r;
        processor = p;
    }

    void showSpecs() {
        System.out.println("Brand: " + brand);
        System.out.println("RAM Size: " + ramSize + " GB");
        System.out.println("Processor: " + processor);
        System.out.println();
    }
}

public class exercise9 {

    public static void main(String[] args) {

        Laptop l1 = new Laptop("Asus TUF A16", 16, "AMD Ryzen 7445HS");
        Laptop l2 = new Laptop("HP", 16, "Intel i7");

        l1.showSpecs();
        l2.showSpecs();
    }
}
