/*
			Inner Class Practice

	- Create a class Car with:
	- An instance variable brand.
	- An inner class Engine with variable horsePower.
	- Write a method showDetails() in Engine that prints car brand + horsepower.
	- In main(), create Car and its Engine, then display details.
 */
class Car {

    String brand;

    Car(String brand) {
        this.brand = brand;
    }

    class Engine {

        int horsePower;

        Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        void showDetails() {
            System.out.println("The car is of : " + brand);
            System.out.println("Horsepower of car : " + horsePower);
        }
    }
}

public class Exercise6 {

    public static void main(String[] args) {
        Car c = new Car("BMW");
        Car.Engine e = c.new Engine(250);

        e.showDetails();
    }
}
