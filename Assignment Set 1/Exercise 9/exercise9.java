/*
                Exercise 9				
-Create a class named Circle with one instance variable: radius, of type double. 
-Create a method area() that prints the area of the circle, 
-Create another method displayRadius(),that prints the radius of the circle.

-In a separate class named CircleDemo, write the main method. Within this method:
-Instantiate two objects of type Circle.
-Assign the following value to circle1: radius = 7.0.
-Assign the following value to circle2: radius = 3.5.
-Call the area() and displayRadius() methods on both circle1 and circle2.
- display the one with the largest area.		
 */

class Circle {

    double radius;

    public double area() {
        return (3.14 * (radius * radius));
    }

    public void display() {
        System.out.println("The radius is: " + radius);
    }
}

public class exercise9 {

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();

        circle1.radius = 7.0;
        circle2.radius = 3.5;

        System.out.println("Circle 1");
        circle1.display();
        System.out.println("Area = " + circle1.area() + "\n");

        System.out.println("Circle 2");
        circle2.display();
        System.out.println("Area = " + circle2.area() + "\n");

        if (circle1.area() > circle2.area()) {
            System.out.println("Circle 1 has the largest area.");
        } else if (circle2.area() > circle1.area()) {
            System.out.println("Circle 2 has the largest area.");
        } else {
            System.out.println("Both circles have equal area.");
        }
    }
}
