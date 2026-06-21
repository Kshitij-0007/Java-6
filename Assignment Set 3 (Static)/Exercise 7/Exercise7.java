/*
			Static Counter with Conditional Logic
Problem:
	- Create a TicketBooking class:
	- Each booking should have a unique booking ID (auto-generated using a static variable).
	- Booking IDs should start from 1001 but skip any number divisible by 5.
	- Write a program to create 10 bookings and print their IDs.
Key points tested:
	- Static counter logic.
	- Conditional incrementing.
	- Real-world mapping (ID generation).	
 */
class TicketBooking {

    static int bookId = 1000;
    int bid;

    public TicketBooking() {
        bookId++;
        if (bookId % 5 != 0) {
            bid = bookId;
        } else {
            bookId++;
            bid = bookId;
        }
    }

    void showId() {
        System.out.println("Booking ID :" + bid);
    }
}

public class Exercise7 {

    public static void main(String[] args) {
        TicketBooking[] t = new TicketBooking[10];
        for (int i = 0; i < 10; i++) {
            t[i] = new TicketBooking();
        }
        System.out.println("The ID of all the tickets: ");
        for (TicketBooking it : t) {
            it.showId();
        }
    }
}
