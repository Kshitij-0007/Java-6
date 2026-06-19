

/*     
           Exercise 1.

-Create a class “Multiplication”, in which declare an integer variable num1, inside main() method assign num1 to 100. 
-Create an object of class “Example_1” which display the number num1 and Display it after multiplying it by 2. 

*/
class Multiplication
{
    int num1;
    public void display()
    {
        System.out.println("The Number is :"+num1+ "\nThe Number doubled is: "+(num1*2));
    }
}

public class exercise1
{
    public static void main(String[] args) {
        Multiplication m=new Multiplication();
        m.num1=100;
        m.display();
    }
}