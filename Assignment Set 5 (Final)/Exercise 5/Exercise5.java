/*
			Create a class LibraryBook with the following requirements:
	- A final variable BOOK_ID that gets initialized in the constructor.
	- A normal variable title.
	- A method showDetails() that prints book ID and title.
	- In main(), create two book objects with different IDs and titles.
	- Try to reassign BOOK_ID after initialization and observe what happens.
 */
class LibraryBook {

    final int BookId;
    String Title;

    public LibraryBook(String Title, int BookId) {
        this.BookId = BookId;
        this.Title = Title;
    }

    void showDetails() {
        System.out.println("Book ID :" + BookId + "\nBook Name :" + Title);
    }

}

public class Exercise5 {

    public static void main(String[] args) {
        LibraryBook b1 = new LibraryBook("Sherlock Holmes", 101);
        LibraryBook b2 = new LibraryBook("Jim Corbett", 102);

        b1.showDetails();
        b2.showDetails();
        // b2.BookId=103;
    }
}
