/*
	- Create a class Flight with the following details:
			- Data members:
				- flightNumber (String)
				- source (String)
				- destination (String)
				- seatsAvailable (int)

		- Requirements:
		- Define a parameterized constructor to initialize flight details.
		- Define a copy constructor that copies flight details from another object but allows you to change seatsAvailable (so that both flights don’t share the same seat count).
		- Define a method bookSeat(int seats) which reduces the available seats if booking is possible, otherwise prints “Not enough seats available”.
		- Define a method display() to show the flight details.

	- In the main method:
		- Create a Flight object f1 using the parameterized constructor.
		- Book some seats on f1.
		- Create another object f2 using the copy constructor (copying f1) but with a different seat availability.
		- Book seats on f2.

	- Display both objects to show they are independent.

*/
