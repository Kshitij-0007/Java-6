/*
    
	*** Overloading with different return types
	
    - Create Two methods getInfo() in class "Student" 
    - One method returns string of student name
	- another method returns integer type variable age. 
	
	- Attempt to overload the methods and observe the error and try to understand 
	  the cause that why java does not allow method overloading purely based on return type.
*/
class Student {
    String getInfo() {
        return "Kshitij";
    }

    int getInfo() {
        return 20;
    }
}

public class Exercise3 {
    public static void main(String[] args) {
        
    }
}