
/*
        - Create a class Payment which is having both abstract and non-abstact methods 
            - abstact : void processPayment(double amount).	
            - non abstact : void paymentConfirmation()
        - Create sub classes: 
            - CreditPayment
            - DebitPayment
            - UPIPayment
            - PayPalPayment.
        - Implement processPayment in subclases	and acheive abstraction.	
 */
abstract class Payment {

    double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    void paymentConfirmation() {
        System.out.println("Payment Successful!!!");
    }

    abstract void processPayment(double amount);
}

class CreditPayment extends Payment {

    public CreditPayment(double amount) {
        super(amount);
    }

    @Override
    void processPayment(double amount) {
        System.out.println("Credit Card Payment: " + amount);
    }
}

class UPIPayment extends Payment {

    public UPIPayment(double amount) {
        super(amount);
    }

    @Override
    void processPayment(double amount) {
        System.out.println("UPI Card Payment: " + amount);
    }
}

class DebitPayment extends Payment {

    public DebitPayment(double amount) {
        super(amount);
    }

    @Override
    void processPayment(double amount) {
        System.out.println("Debit Card Payment: " + amount);
    }
}

class PayPalPayment extends Payment {

    public PayPalPayment(double amount) {
        super(amount);
    }

    @Override
    void processPayment(double amount) {
        System.out.println("PayPal Card Payment: " + amount);
    }
}

public class Exercise1 {

    public static void main(String[] args) {
        Payment p1 = new CreditPayment(1000);
        Payment p2 = new DebitPayment(2000);
        Payment p3 = new UPIPayment(1500);
        Payment p4 = new PayPalPayment(3000);

        p1.processPayment(1000);
        p1.paymentConfirmation();

        p2.processPayment(2000);
        p2.paymentConfirmation();

        p3.processPayment(1500);
        p3.paymentConfirmation();

        p4.processPayment(3000);
        p4.paymentConfirmation();
    }
}
