/*
		Exercise 1
- Create a class BankAccount with account number, holder name, and balance.
- Implement deposit and withdraw methods.
- Display updated balance after each transaction.
 */

import java.util.Scanner;

class BankAcc {

    int acno;
    String name;
    float balance;

    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the acc no: ");
        acno = sc.nextInt();
        sc.nextLine();
        System.out.print("\nEnter the Name: ");
        name = sc.nextLine();
        System.out.print("\nEnter the initial Balance: ");
        balance = sc.nextFloat();
    }

    public void display() {
        System.out.println("\nAc No: " + acno + "\nName: " + name + "\nBalance: " + balance);
    }

    public void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount to deposit: ");
        float cred = sc.nextFloat();
        if (cred <= 0) {
            System.out.println("Please enter valid amount !");
            return;
        }
        balance += cred;
    }

    public void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the amount to withdraw from the account: ");
        float withdraw = sc.nextFloat();
        if (withdraw > balance) {
            System.out.println("Insufficient balance!");
            return;
        }
        balance -= withdraw;
    }
}

public class exercise13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAcc ac[] = new BankAcc[4];

        for (int i = 0; i < 4; i++) {
            ac[i] = new BankAcc();
            ac[i].accept();
        }

        int choice, acn;
        do {
            System.out.println("\n=================Bank Menu=================");
            System.out.println("1.Deposit\n2.Withdraw\n3.Show\n4.Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter your account number: ");
                    acn = sc.nextInt();
                    for (int i = 0; i < 4; i++) {
                        if (ac[i].acno == acn) {
                            ac[i].deposit();
                            break;
                        }
                    }
                    break;

                case 2:
                    System.out.print("Enter your account number: ");
                    acn = sc.nextInt();
                    for (int i = 0; i < 4; i++) {
                        if (ac[i].acno == acn) {
                            ac[i].withdraw();
                            break;
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter your account number: ");
                    acn = sc.nextInt();
                    for (int i = 0; i < 4; i++) {
                        if (ac[i].acno == acn) {
                            ac[i].display();
                            break;
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting the bank menu...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);
    }
}
