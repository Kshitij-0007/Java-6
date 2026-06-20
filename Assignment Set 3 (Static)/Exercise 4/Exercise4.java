/*
		Employee ID Generator
	Create an Employee class.
	Each employee should have a unique employeeID starting from 101.
	Skip IDs that are multiples of 7.
	Add a static method to print how many employees are created.
*/
class Employee {
    private static int empId = 100;
    private static int totalCount = 0;
    private int eid;

    public Employee() {
        do {
            empId++;
        } while (empId % 7 == 0);

        this.eid = empId;
        totalCount++;
    }

    public int getEid() {
        return eid;
    }

    public static int getTotalEmployees() {
        return totalCount;
    }
}
public class Exercise4{
    public static void main(String[] args) {
        Employee e=new Employee();
        int eid=e.getEid();
        System.out.println("The Employee ID   : "+eid);
        int totalEmployee=Employee.getTotalEmployees();
        System.out.println("The Employee Count: "+totalEmployee);
        
    }
}