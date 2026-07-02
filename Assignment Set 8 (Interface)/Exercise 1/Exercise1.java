/*
        - Define an abstract class vehicle having fields 
			- string type
			- int MaxSpeed
		- abstract methods:
			- start()
			- stop()
		- concreate methods:
			- fuelEffficiency() (which returns different efficiency based on types)
	- Define an - interface Electric with method ChargeBattery()
				- interface FuelBased wiht method refuel()
    - Create a class ElectricCar which extends vehicle and implements Electric(implement the method logically like increasing the battery level for charge Battery.)
    - Create a class GasolineCar that extends vehicle and implements FuelBAsed. Implement refuel() to add fuel to the car.
 */
interface Electric {

    void ChargeBattery();
}

interface FuelBased {

    void refuel();
}

abstract class Vehicle {

    String type;
    int MaxSpeed;

    abstract void start();

    abstract void stop();

    void fuelEffficiency() {
        System.out.println("The vehicle efficiency depends on the type of vehicle");
    }
}

class ElectricCar extends Vehicle implements Electric {

    int batteryLevel = 20;

    @Override
    public void ChargeBattery() {
        batteryLevel = 100;
        System.out.println("Battery Charged: " + batteryLevel + "%");
    }

    @Override
    void start() {
        System.out.println("Electric Car Started");
    }

    @Override
    void stop() {
        System.out.println("Electric Car Stopped");
    }

    @Override
    void fuelEffficiency() {
        System.out.println("Electric Car Efficiency: 150 km/charge");
    }
}

class GasolineCar extends Vehicle implements FuelBased {

    int fuel = 10;

    @Override
    public void refuel() {
        fuel = 50;
        System.out.println("Fuel Tank: " + fuel + " Litres");
    }

    @Override
    void start() {
        System.out.println("Gasoline Car Started");
    }

    @Override
    void stop() {
        System.out.println("Gasoline Car Stopped");
    }

    @Override
    void fuelEffficiency() {
        System.out.println("Gasoline Car Efficiency: 18 km/l");
    }
}

public class Exercise1 {

    public static void main(String[] args) {
        ElectricCar e = new ElectricCar();
        e.start();
        e.ChargeBattery();
        e.fuelEffficiency();
        e.stop();

        GasolineCar g = new GasolineCar();
        g.start();
        g.refuel();
        g.fuelEffficiency();
        g.stop();
    }
}
