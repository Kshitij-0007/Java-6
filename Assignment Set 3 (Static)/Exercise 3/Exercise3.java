/*
   - Create a class "CallByeValue" 
   - in main() method initialise a variable x to 10 and 
   - call the method changeValue() to change the value of x to 20
   - print the value of x 

    - After this declare ChangeValue() as static  and repeat the above steps 
*/

public class Exercise3{
    static int changeValue()
    {
        return 20;
    }
    public static void main(String[] args) {
        int x=10;
        System.out.println("The current value of x  :"+x);
        x=changeValue();
        System.out.println("The current value of x  :"+x);
    }
}