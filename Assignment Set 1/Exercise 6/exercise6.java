/*
           Exercise 6
		 
Design a Java program to demonstrate how to define class with properties,
and compute the values with those properties. 

-Create a class "BOX" which has 3 variables of type double : 
    -Width
    -Height
    -depth

In a seperate class named "BoxDemo" write main() method, 
in this method: 
   
   -Create an object of type BOX. 
   -Assign following values to that instance variable of BOX object 
        -Width = 10.00,
        -Height = 20.00,
        -depth = 50.00.
    -Compute and display the volume of the box.
	
-Further more: 	
-Create two different objects box1 and box2 of type BOX, 
-Assign different values to instance variables and calculate volume of box for these two different objects.	
 */
class Box {

    double width;
    double height;
    double depth;

    public void volume() {
        double volume = width * height * depth;
        System.out.println("The Volume of box is :" + volume);
    }
}

public class exercise6 {

    public static void main(String[] args) {
        Box b1 = new Box();
        b1.width = 10.0;
        b1.depth = 50.0;
        b1.height = 20.0;
        b1.volume();
        Box b2 = new Box();
        b2.width = 20.0;
        b2.depth = 30.0;
        b2.height = 10.0;
        b2.volume();
    }
}
