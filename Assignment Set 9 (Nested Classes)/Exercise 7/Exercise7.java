/*

			Stack Class Practice Question


	- Stack Creation
		- Write a Java class Stack that:
		- Uses an array of size 5.
		- Has methods push(int x) and pop() to insert and remove elements.
		- Print "Stack Overflow" if an element is pushed when full, and "Stack Underflow" if popped when empty.

	- Stack Operations with Display
		- Enhance the Stack class to include:
		- peek() → returns top element without removing.
		- isEmpty() and isFull() methods.
		- display() → prints all stack elements from top to bottom.
		- Test it in main().
 */
class Stack {

    int[] arr = new int[5];
    int top = -1;

    void push(int x) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;
    }

    void pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println("Popped: " + arr[top--]);
    }

    void peek() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println("Top Element: " + arr[top]);
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == arr.length - 1;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println("Stack Elements:");
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}

public class Exercise7 {

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);

        s.display();

        s.peek();

        s.pop();
        s.pop();

        s.display();

        System.out.println(s.isEmpty());
        System.out.println(s.isFull());
    }
}
