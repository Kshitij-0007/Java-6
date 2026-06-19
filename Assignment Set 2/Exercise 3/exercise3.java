/*
      Stack
	  
	- Implement class "Stack". 
	- No of elements = 10. 
	- Methods:  
	       - Push(): to insert an element
		   - item(): to add an integer to stack
		   - Pop(): to remove an element.
 	- return the top integer. 
	- Ensure that stack will handle the overflow and underflow conditions with appropriate methods.
	
	
	- Write a class "TestStack" to demonstrate pushing and poping values from two stacks.
	
	
 */
class Stack {

    int[] arr = new int[10];
    int top = -1;

    void push(int item) {
        if (top == 9) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            arr[top] = item;
            System.out.println(item + " pushed");
        }
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            int value = arr[top];
            top--;
            return value;
        }
    }

    int item() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        } else {
            return arr[top];
        }
    }
}

public class exercise3 {

    public static void main(String[] args) {

        Stack s1 = new Stack();
        Stack s2 = new Stack();

        s1.push(10);
        s1.push(20);
        s1.push(30);

        s2.push(100);
        s2.push(200);

        System.out.println("Top of Stack 1: " + s1.item());
        System.out.println("Popped from Stack 1: " + s1.pop());

        System.out.println("Top of Stack 2: " + s2.item());
        System.out.println("Popped from Stack 2: " + s2.pop());
    }
}
