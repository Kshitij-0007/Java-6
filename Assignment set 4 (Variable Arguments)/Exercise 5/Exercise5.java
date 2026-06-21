/*

	- Create a method average(int... nums) that returns the average of given numbers. 
	- Handle the case when no numbers are passed (return 0).

 */
public class Exercise5 {

    void showAvg(int... nums) {
        int avg = 0;
        int count = 0;
        int sum = 0;
        for (int num : nums) {
            sum += num;
            count++;
        }
        if (count != 0) {
            avg = sum / count;
        }
        System.out.println("The average of given input is :" + avg);
    }

    public static void main(String[] args) {
        Exercise5 e = new Exercise5();
        e.showAvg();
        System.out.println("");
        e.showAvg(10);
        System.out.println("");
        e.showAvg(10, 20);
        System.out.println("");
        e.showAvg(10, 20, 30);
        System.out.println("");
        e.showAvg(10, 20, 30, 40);
        System.out.println("");
        e.showAvg(10, 20, 30, 40, 50);
        System.out.println("");
    }
}
