/*

			Inner Class – Company & Employee

	- Create a class Company with an instance variable companyName.
	- Define an inner class Employee with variables empName and salary.
	- Add a method showDetails() that prints employee name, salary, and company name.
	- In main(), create a Company and add employees to it.
 */
class Company {

    String companyName;

    Company(String companyName) {
        this.companyName = companyName;
    }

    class Employee {

        String empName;
        double salary;

        Employee(String empName, double salary) {
            this.empName = empName;
            this.salary = salary;
        }

        void showDetails() {
            System.out.println("Company Name: " + companyName);
            System.out.println("Employee Name: " + empName);
            System.out.println("Salary: " + salary);
        }
    }
}

public class Exercise2 {

    public static void main(String[] args) {
        Company c = new Company("ABC Technologies");

        Company.Employee e1 = c.new Employee("Kshitij", 50000);
        Company.Employee e2 = c.new Employee("Rahul", 60000);

        e1.showDetails();
        e2.showDetails();
    }
}
