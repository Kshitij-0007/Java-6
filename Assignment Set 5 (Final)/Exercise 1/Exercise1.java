/*
    - create a class "Circle" having following members: 
		- final double pi initialize to 3.14.
		- double CalculateArea(double radius): calculate and returns the area of circle using Pi constant. 
		- Try modifying the value of pi in constructor of another class and check what happens.
 */
class Circle {

    final double pi = 3.14;
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double CalculateArea(double radius) {
        return pi * radius * radius;
    }
}

public class Exercise1 {

    public static void main(String[] args) {
        Circle c1 = new Circle(10);
        double area = c1.CalculateArea(c1.radius);
        System.out.println("The Area of circle is :" + area);
        
    }
}
