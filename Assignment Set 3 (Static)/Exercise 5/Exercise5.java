/*
			Bank Account Tracker
	- Create a BankAccount class.
	- Each account has an accountNumber (auto-generated using a static variable, starts from 10001).
	- A static variable should keep track of the total accounts created.
	- A static method showTotalAccounts() displays the count.
 */
class BankAccount {

    static int accountNumber = 10000;
    static int totalAccounts = 0;
    int accNo;

    public BankAccount() {
        accountNumber += 1;
        accNo = accountNumber;
        totalAccounts++;
    }

    static void showTotalAccounts() {
        System.out.println("The Total number of accounts  :" + totalAccounts);
    }

    void showAccNo() {
        System.out.println("The accounts number :" + accNo);
    }
}

class Exercise5 {

    public static void main(String[] args) {
        BankAccount.showTotalAccounts();
        BankAccount b1 = new BankAccount();
        BankAccount.showTotalAccounts();
        b1.showAccNo();
        BankAccount b2 = new BankAccount();
        BankAccount.showTotalAccounts();
        b2.showAccNo();
    }
}
