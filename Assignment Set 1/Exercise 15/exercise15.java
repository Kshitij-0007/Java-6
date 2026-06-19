/*

		Exercise 15
- Create a class Car with model, mileage, price. 
- Accept details for 4 cars and display the model 
  of the cheapest one with mileage above 20.		

 */
import java.util.Scanner;

class Car {

    String model;
    double mileage;
    double price;

    void setData(String m, double mi, double p) {
        model = m;
        mileage = mi;
        price = p;
    }
}

public class exercise15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Car[] cars = new Car[4];

        for (int i = 0; i < 4; i++) {
            cars[i] = new Car();

            System.out.println("Enter model:");
            String model = sc.nextLine();

            System.out.println("Enter mileage (km/l):");
            double mileage = sc.nextDouble();

            System.out.println("Enter price:");
            double price = sc.nextDouble();
            sc.nextLine();

            cars[i].setData(model, mileage, price);
        }

        double minPrice = Double.MAX_VALUE;
        String cheapestModel = "";

        for (int i = 0; i < 4; i++) {
            if (cars[i].mileage > 20 && cars[i].price < minPrice) {
                minPrice = cars[i].price;
                cheapestModel = cars[i].model;
            }
        }

        System.out.println("Cheapest car model with mileage above 20 km/l: " + cheapestModel);

        sc.close();
    }
}
