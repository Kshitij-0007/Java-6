/*
	- Create a class Employee with name and basic salary. 
	- Constructor should calculate gross salary = basic salary + 20% HRA + 10% DA.
 */

import java.util.Scanner;

class Employee {

    String name;
    double basicSalary;
    double grossSalary;

    Employee(String n, double b) {
        name = n;
        basicSalary = b;

        double hra = 0.20 * basicSalary;
        double da = 0.10 * basicSalary;

        grossSalary = basicSalary + hra + da;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Gross Salary: " + grossSalary);
    }
}

public class exercise6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter employee name:");
        String name = sc.nextLine();

        System.out.println("Enter basic salary:");
        double salary = sc.nextDouble();

        Employee e = new Employee(name, salary);

        e.display();

        sc.close();
    }
}
