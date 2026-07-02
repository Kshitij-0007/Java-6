/*

			 Static Nested Class Practice

	- Create a class Library with a static nested class Book.
	- Book should have fields: title, author.
	- Add a method displayBook() that prints details.
	- In main(), create Library.Book objects and display them.

*/
class Library {

    static class Book {
        String title;
        String author;

        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        void displayBook() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
        }
    }
}

public class Exercise5 {
    public static void main(String[] args) {
        Library.Book b1 = new Library.Book("Java Programming", "James Gosling");
        Library.Book b2 = new Library.Book("Data Structures", "Mark Allen");

        b1.displayBook();
        b2.displayBook();
    }
}
