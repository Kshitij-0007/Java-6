/*
    - Write a class "MonthDays" with final static array "days_in_month"
	  which represents the number of days in each month.	
	- Implement getDayInMonth(int month) which returns days in specified month. 	
	- Note: Try to modify array elements using another method. 
 */
class MonthDays {

    static final int[] days_in_month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    static int getDayInMonth(int month) {
        if (month >= 1 && month <= 12) {
            return days_in_month[month - 1];
        }
        return -1;
    }

    static void modify() {
        days_in_month[1] = 29;
    }
}

public class Exercise4 {

    public static void main(String[] args) {
        System.out.println(MonthDays.getDayInMonth(1));
        System.out.println(MonthDays.getDayInMonth(2));
        MonthDays.modify();
        System.out.println(MonthDays.getDayInMonth(2));
    }
}
