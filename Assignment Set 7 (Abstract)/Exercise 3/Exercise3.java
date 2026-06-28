/*
   - A logistic company delivers via air, land and sea. Each mode of delivery has its own transportation methods and cost calculatin based on distance and weight 
   - All deliveries must go throgh a booking process and the company needs to track the status and generate report for all deliveries.
   - Create an abstract class Delivery with abstract methods: 
			- transport()
			- CalculateCost()
		- a concreate method bookDelivery() to handle booking and call the abstract methods.
    - Create an Inteface trackable with methods: 
			- UpdateStatus(string status),
			- generateReport().
	- Implement Delivery subclasses 
			- AirDelivery 
			- LandDelivery
			- SeaDelivey    to define there specific transportation and cost logic		
 */
interface trackable {

    void UpdateStatus(String status);

    void generateReport();
}

abstract class Delivery {

    double distance;
    double weight;

    public Delivery(double distance, double weight) {
        this.distance = distance;
        this.weight = weight;
    }

    abstract void transport();

    abstract void calculateCost();

    void bookDelivery() {
        System.out.println("Delivery Booked");
        transport();
        calculateCost();
    }
}

class AirDelivery extends Delivery implements trackable {

    String status;

    public AirDelivery(double distance, double weight) {
        super(distance, weight);
    }

    @Override
    void transport() {
        System.out.println("Transport by Air");
    }

    @Override
    void calculateCost() {
        System.out.println("Cost: " + (distance * weight * 10));
    }

    @Override
    public void UpdateStatus(String status) {
        this.status = status;
    }

    @Override
    public void generateReport() {
        System.out.println("Air Delivery Status: " + status);
    }
}

class LandDelivery extends Delivery implements trackable {

    String status;

    public LandDelivery(double distance, double weight) {
        super(distance, weight);
    }

    @Override
    void transport() {
        System.out.println("Transport by Land");
    }

    @Override
    void calculateCost() {
        System.out.println("Cost: " + (distance * weight * 5));
    }

    @Override
    public void UpdateStatus(String status) {
        this.status = status;
    }

    @Override
    public void generateReport() {
        System.out.println("Land Delivery Status: " + status);
    }
}

class SeaDelivery extends Delivery implements trackable {

    String status;

    public SeaDelivery(double distance, double weight) {
        super(distance, weight);
    }

    @Override
    void transport() {
        System.out.println("Transport by Sea");
    }

    @Override
    void calculateCost() {
        System.out.println("Cost: " + (distance * weight * 3));
    }

    @Override
    public void UpdateStatus(String status) {
        this.status = status;
    }

    @Override
    public void generateReport() {
        System.out.println("Sea Delivery Status: " + status);
    }
}

public class Exercise3 {

    public static void main(String[] args) {
        AirDelivery a = new AirDelivery(100, 20);
        LandDelivery l = new LandDelivery(100, 20);
        SeaDelivery s = new SeaDelivery(100, 20);

        a.bookDelivery();
        a.UpdateStatus("In Transit");
        a.generateReport();

        l.bookDelivery();
        l.UpdateStatus("Delivered");
        l.generateReport();

        s.bookDelivery();
        s.UpdateStatus("Shipped");
        s.generateReport();
    }
}
