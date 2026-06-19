/*
                            Exercise 10				
- Create a class named Sphere with one instance variable: radius, of type double. 
- Create a method volume() that prints the volume of the sphere, 
- Create another method displayRadius() that prints the radius of the sphere.

-In a separate class named SphereDemo, write the main method. Within this method:
-Instantiate two objects of type Sphere.
-Assign the following value to sphere1: radius = 4.0.
-Assign the following value to sphere2: radius = 2.5.
-Call the volume() and displayRadius() methods on both sphere1 and sphere2.
- display the one with the largest volume.				
 */
class Sphere {

    double radius;

    public double volume() {
        return ((4.0 / 3.0) * 3.14 * (radius * radius * radius));
    }

    public void displayRadius() {
        System.out.println("The radius: " + radius);
    }
}

public class exercise10 {

    public static void main(String[] args) {
        Sphere sphere1 = new Sphere();
        Sphere sphere2 = new Sphere();

        sphere1.radius = 4.0;
        sphere2.radius = 2.5;

        System.out.println("Sphere 1");
        sphere1.displayRadius();
        System.out.println("Volume = " + sphere1.volume() + "\n");

        System.out.println("Sphere 2");
        sphere2.displayRadius();
        System.out.println("Volume = " + sphere2.volume() + "\n");

        if (sphere1.volume() > sphere2.volume()) {
            System.out.println("Sphere 1 has the largest volume.");
        } else if (sphere2.volume() > sphere1.volume()) {
            System.out.println("Sphere 2 has the largest volume.");
        } else {
            System.out.println("Both spheres have equal volume.");
        }
    }
}
