/*
                Exercise 11				
-Create a class named Cuboid with three instance variables: length, width, and height, all of type double. 
-Create a method volume() that prints the volume of the cuboid, 
-Create another method displayDimensions() that prints the dimensions of the cuboid.

-In a separate class named CuboidDemo, write the main method. Within this method:
-Instantiate two objects of type Cuboid.
-Assign the following values to cuboid1: length = 10.0, width = 5.0, height = 2.0.
-Assign the following values to cuboid2: length = 6.0, width = 4.0, height = 3.0.
-Call the volume() and displayDimensions() methods on both cuboid1 and cuboid2.
- display the one with the largest volume.
 */

class Cuboid {

    double length;
    double width;
    double height;

    public double volume() {
        return length * width * height;
    }

    public void displayDimensions() {
        System.out.println("Length: " + length + "\nWidth: " + width + "\nHeight: " + height);
    }
}

public class exercise11 {

    public static void main(String[] args) {

        Cuboid cuboid1 = new Cuboid();
        Cuboid cuboid2 = new Cuboid();

        cuboid1.length = 10.0;
        cuboid1.width = 5.0;
        cuboid1.height = 2.0;

        cuboid2.length = 6.0;
        cuboid2.width = 4.0;
        cuboid2.height = 3.0;

        System.out.println("Cuboid 1");
        cuboid1.displayDimensions();
        System.out.println("Volume = " + cuboid1.volume() + "\n");

        System.out.println("Cuboid 2");
        cuboid2.displayDimensions();
        System.out.println("Volume = " + cuboid2.volume() + "\n");

        if (cuboid1.volume() > cuboid2.volume()) {
            System.out.println("Cuboid 1 has the largest volume.");
        } else if (cuboid2.volume() > cuboid1.volume()) {
            System.out.println("Cuboid 2 has the largest volume.");
        } else {
            System.out.println("Both cuboids have equal volume.");
        }
    }
}
