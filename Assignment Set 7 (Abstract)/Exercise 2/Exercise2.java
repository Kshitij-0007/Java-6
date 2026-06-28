/*
    - Create an abstract class Appliance and an abstract method :
        - turnON() to turn the appliance on. 
		- turnOFF() to turn the appliance of.
	- A concreate method showStatus() to dispay the current status (ON or OFF).
    - Create subclasses 
			- WashingMachine, 	
			- Refrigerator   which implements methods.
	- Write a program to control the appliances and show the status.
 */
abstract class Appliance {

    boolean status;

    void showStatus() {
        System.out.println("The status of appliance :" + status);
    }

    abstract void turnON();

    abstract void turnOFF();
}

class WashingMachine extends Appliance {

    @Override
    void turnON() {
        status = true;
    }

    @Override
    void turnOFF() {
        status = false;
    }
}

class Refrigerator extends Appliance {

    @Override
    void turnON() {
        status = true;
    }

    @Override
    void turnOFF() {
        status = false;
    }
}

public class Exercise2 {

    public static void main(String[] args) {
        Appliance a = new WashingMachine();
        System.out.println("Washing Machine :");
        a.showStatus();
        a.turnON();
        a.showStatus();
        a.turnOFF();
        a.showStatus();

        System.out.println("\nRefrigerator :");
        a.showStatus();
        a.turnON();
        a.showStatus();
        a.turnOFF();
        a.showStatus();

    }
}
