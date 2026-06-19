/*
         Exercise 5
		 
Write a Java program to compute and display the distance that light travels in given no. of days, 
your program should: 
 
    - define variables  to represent speed of light, the number of days, total time and distance of light travels
	- Initialize speed of light to 186000 miles per second.
	- Set the number of days to 1000 (You can change this value to compute different distances)
	- Calculate the total number of seconds in the specified number of days.
	- Compute the distance light travels by multiplying the total seconds by speed of light.
	- Print the result in the format: "In <number of days> days light will travel about <distance> miles
	 
 */
class LightTravel {

    long speed; // miles per second
    int numOfDays;
    long totalSeconds;
    long distance;

    LightTravel() {
        speed = 186000;
        numOfDays = 1000;
    }

    void lightTravels() {

        totalSeconds = (long) numOfDays * 24 * 60 * 60;
        distance = speed * totalSeconds;
        System.out.println(
                "In " + numOfDays + " days light will travel about " + distance + " meters");
    }
}

public class exercise5 {
    public static void main(String[] args) {
        LightTravel l1 = new LightTravel();
        l1.numOfDays = 1;
        l1.lightTravels();
    }
}
