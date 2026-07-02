/*
			Local Inner Class in Method – Bank Loan

	- Create a class Bank with a method calculateLoan(int amount).
	- Inside it, define a local inner class Interest that calculates 10% interest on the loan.
	- Display the loan amount and total repayment.
 */
class Bank {

    void calculateLoan(int amount) {

        class Interest {

            void calculate() {
                double interest = amount * 0.10;
                double total = amount + interest;

                System.out.println("Loan Amount: " + amount);
                System.out.println("Interest: " + interest);
                System.out.println("Total Repayment: " + total);
            }
        }

        Interest i = new Interest();
        i.calculate();
    }
}

public class Exercise3 {

    public static void main(String[] args) {
        Bank b = new Bank();
        b.calculateLoan(50000);
    }
}
