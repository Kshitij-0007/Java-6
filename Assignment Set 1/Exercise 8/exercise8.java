/*
                Exercise 8
-CreateCreate a class named "Rectangle" with two instance variables: length and width, both of type double. 
-create a method perimeter() that prints the perimeter of the rectangle,
-Create another method displayDimensions(),that prints the dimensions of the rectangle.

-In a separate class named RectangleDemo, write the main method. Within this method:
-Instantiate two objects of type Rectangle.
-Assign the following values to rect1: length = 12.0, width = 8.0.
-Assign the following values to rect2: length = 5.0, width = 3.0.
-Call the perimeter() and displayDimensions() methods on both rect1 and rect2.
- display the one with the largest Parimeter.				
 */

class Rectangle {

    double length;
    double width;

    public void display() {
        System.out.println("Length: " + length + "\nWidth: " + width);
    }

    public double perimeter() {
        return (2 * (length + width));
    }
}

public class exercise8 {

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle();

        rect1.length = 12.0;
        rect1.width = 8.0;

        rect2.length = 5.0;
        rect2.width = 3.0;

        System.out.println("Rectangle 1");
        rect1.display();
        System.out.println("Perimeter = " + rect1.perimeter() + "\n");

        System.out.println("Rectangle 2");
        rect2.display();
        System.out.println("Perimeter = " + rect2.perimeter() + "\n");

        if (rect1.perimeter() > rect2.perimeter()) {
            System.out.println("Rectangle 1 has the largest perimeter.");
        } else if (rect2.perimeter() > rect1.perimeter()) {
            System.out.println("Rectangle 2 has the largest perimeter.");
        } else {
            System.out.println("Both rectangles have equal perimeter.");
        }

    }
}
