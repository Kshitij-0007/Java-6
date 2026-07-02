/*
	- Design an online payment sytem using the interfaces. 
	- Implement the folllowing requirements: 
		- Interface PaymentMethod: 
			-> Define a constant TransactionFee = 0.02. ..
			-> Add an abstract method pay(double amount). ..
			-> Create a default method calculateFee(double amount). ..
			to calculate and print the  fee based on TransactionFee. ..
			-> Add a static method to print TransactionLimit() which display transaction limit as 1 lakh. ..
		
		- Additional Interface: 
			-> interface OnlineTranfer with an abstract method   AuthenticateUser(string Username, string Password)...
			-> interface CardPayment with an abstract method verifyCardDetails(String CardNumber,string ExpiryDate)			
		- Classes:
			-> CreditCard :
					It implements paymentMethod , CardPayment and fields for CardNumber and ExpiryDate...
					also implements verifyCardDetails()...
			-> DigitalWallet: 
					It implements PaymentMethod , OnlineTranfer and has fields for 
					Username and Password.
					also implements AuthenticateUser().
					
    - Create objects of CreditCard and DigitalWallet and demonstrate pay(),calculateFee() and print TransactionLimit().
 */
import java.util.Scanner;

interface PaymentMethod {

    final double TransactionFee = 0.02;

    abstract void pay(double amount);

    double calculateFee(double amount);

    static void TransactionLimit() {
        System.out.println("Maximum Transaction Limit : Rs.100000");
    }
}

interface OnlineTransfer {

    abstract boolean AuthenticateUser(String username, String password);
}

interface CardPayment {

    abstract boolean verifyCardDetails(String cardNumber, String expiryDate);
}

class CreditCard implements PaymentMethod, CardPayment {

    double amount;
    String cardNumber;
    String expiryDate;

    public CreditCard(double amount, String cardNumber, String expiryDate) {
        this.amount = amount;
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
    }

    @Override
    public void pay(double amount) {
        if (amount > 100000) {
            System.out.println("Transaction exceeds the maximum limit.");
            PaymentMethod.TransactionLimit();
            return;
        }
        if (verifyCardDetails(cardNumber, expiryDate) == true) {
            if (amount > this.amount) {
                System.out.println("\nCannot debit more amount than the actual amount in account. Please enter a valid amount");
            }
            System.out.println("Debited " + amount + " rs. Successfully from your account!");
            this.amount -= amount;
            this.amount -= calculateFee(amount);
        } else {
            System.out.println("Please try again");
        }
    }

    @Override
    public double calculateFee(double amount) {
        amount *= TransactionFee;
        return amount;
    }

    @Override
    public boolean verifyCardDetails(String cardNumber, String expiryDate) {
        if (this.cardNumber.equals(cardNumber) && this.expiryDate.equals(expiryDate)) {
            System.out.println("The Card details are authenticated successfully");
            return true;
        } else {
            System.out.println("The Card details are not matched, Please try again");
            return false;
        }
    }
}

class DigitalWallet implements PaymentMethod, OnlineTransfer {

    double amount;
    String username;
    String password;

    public DigitalWallet(double amount, String username, String password) {
        this.amount = amount;
        this.username = username;
        this.password = password;
    }

    @Override
    public void pay(double amount) {
        if (amount > 100000) {
            System.out.println("Transaction exceeds the maximum limit.");
            PaymentMethod.TransactionLimit();
            return;
        }
        if (AuthenticateUser(username, password) == true) {
            if (amount > this.amount) {
                System.out.println("\nCannot debit more amount than the actual amount in account. Please enter a valid amount");
            }
            System.out.println("Debited " + amount + " rs. Successfully from your account!");
            this.amount -= amount;
            this.amount -= calculateFee(amount);
        } else {
            System.out.println("Please try again");
        }
    }

    @Override
    public double calculateFee(double amount) {
        amount *= TransactionFee;
        return amount;
    }

    @Override
    public boolean AuthenticateUser(String username, String password) {
        if (this.username.equals(username) && this.password.equals(password)) {
            System.out.println("The User details are authenticated successfully");
            return true;
        } else {
            System.out.println("The User details are not matched, Please try again");
            return false;
        }
    }
}

public class Exercise3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CreditCard c1 = new CreditCard(40000, "21213131", "12341234");
        DigitalWallet d1 = new DigitalWallet(90000, "Maximus", "331313");

        PaymentMethod.TransactionLimit();

        c1.verifyCardDetails("21213131", "12341234");
        d1.AuthenticateUser("Maximus", "331313");

        c1.pay(1200);
        System.out.println("");
        d1.pay(4000);
        System.out.println("");

        c1.pay(50000);
    }
}
