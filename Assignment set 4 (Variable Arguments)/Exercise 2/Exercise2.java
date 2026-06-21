
/*
		- Create a method findSum(int... nums) that returns the sum of all arguments passed. 
		- Test it with different sets of numbers.
 */
public class Exercise2 {

    void findSum(int... nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        System.out.println("The Sum of all numbers : " + sum);
    }

    public static void main(String[] args) {
        Exercise2 e = new Exercise2();
        e.findSum(10, 20);
        e.findSum(10, 20, 30);
        e.findSum(1, 2, 3, 4, 5);
        e.findSum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }
}
