/*
             Exercise 7
Write a program in Java in which 

-Create a class named Triangle with three instance variables: side1, side2, and side3, all of type double. 
-Create a method area() that calculates and prints the area of the triangle using Heron's formula, 
-create method displaySides() that prints the lengths of the sides.

-In a separate class named TriangleDemo, 
-write the main method. Within this method:
-Instantiate two objects of type Triangle.
-Assign the following values to tri1: side1 = 6.0, side2 = 8.0, side3 = 10.0.
-Assign the following values to tri2: side1 = 3.0, side2 = 4.0, side3 = 5.0.
-Call the area() and displaySides() methods on both tri1 and tri2.
- display the one with the largest area.
 */

class Triangle {

    double side1;
    double side2;
    double side3;

    // Method to calculate area
    public double area() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Method to display sides
    public void displaySides() {
        System.out.println("Side 1: " + side1);
        System.out.println("Side 2: " + side2);
        System.out.println("Side 3: " + side3);
    }
}

public class exercise7 {

    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();
        t1.side1 = 6.0;
        t1.side2 = 8.0;
        t1.side3 = 10.0;

        t2.side1 = 3.0;
        t2.side2 = 4.0;
        t2.side3 = 5.0;
        System.out.println("Triangle 1");
        t1.displaySides();
        System.out.println("Area = " + t1.area());

        System.out.println("\nTriangle 2");
        t2.displaySides();
        System.out.println("Area = " + t2.area());

        if (t1.area() > t2.area()) {
            System.out.println("Triangle 1 has the largest area.");
        } else if (t2.area() > t1.area()) {
            System.out.println("Triangle 2 has the largest area.");
        } else {
            System.out.println("Both triangles have equal area.");
        }
    }
}
