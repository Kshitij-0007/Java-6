/*
	- Create a class City with data members: name, population, and area.
	-Define a parameterized constructor to initialize these values.
	-Define a copy constructor to create a new city object by copying another city object.
	-Define a method display() to print city details.

	- In the main method:
	- Create one City object using the parameterized constructor.
	- Create another City object using the copy constructor.

	- Display both objects to verify the copied values.

 */
class City {

    String name;
    int population;
    double area;

    City(String n, int p, double a) {
        name = n;
        population = p;
        area = a;
    }

    City(City c) {
        name = c.name;
        population = c.population;
        area = c.area;
    }

    void display() {
        System.out.println("City Name: " + name);
        System.out.println("Population: " + population);
        System.out.println("Area: " + area + " sq.km");
        System.out.println();
    }
}

public class exercise8 {

    public static void main(String[] args) {

        City c1 = new City("Mumbai", 20000000, 603.4);

        City c2 = new City(c1);

        System.out.println("Original City:");
        c1.display();

        System.out.println("Copied City:");
        c2.display();
    }
}
