/*

   - Create class "Employee" with final variables:
   -  final EmployeeId
   - constructor which initialises it
   - Implement the method to getEmployeeId to return ID
 */
class Employee {

    final int EmployeeId;

    public Employee(int EmployeeId) {
        this.EmployeeId = EmployeeId;
    }

    int getEmployeeId() {
        return EmployeeId;
    }

}

public class Exercise3 {

    public static void main(String[] args) {
        Employee e = new Employee(1001);
        System.out.println("The Employee id : " + e.getEmployeeId());
    }
}
