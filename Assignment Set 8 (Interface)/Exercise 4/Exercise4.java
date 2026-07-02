/*
	- Create a class CurrencyConverter with a final field ConversionRate. 
	- Initialize this field to a specific value like 72.4 for converting dollars to rupees within the class. 
	- In a main class try creating an instance of CurrencyConverter and changing the value of ConversionRate. 
	- Understand why final fields cannot be changed after initialization.

 */
class CurrencyConverter {

    final double conversionRate = 72.4;

    void convert(double dollars) {
        double rupees = dollars * conversionRate;
        System.out.println(dollars + " USD = " + rupees + " INR");
    }
}

public class Exercise4 {

    public static void main(String[] args) {
        CurrencyConverter cc = new CurrencyConverter();
        cc.convert(10);

        // cc.conversionRate=80.4;//Error
        // cannot assign a value to final variable conversionRate(errors(1): 22:9-22:32)
        // CurrencyConverter
        // final double conversionRate = 72.4
    }
}
