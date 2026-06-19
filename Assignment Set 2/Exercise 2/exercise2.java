/*

    - Create class "Book" which represents books in library.
	- Class Members: 
	       - BookName,
		   - Author
		   - PublishedYear
	
    - Write a default constructor which initialises 
	       - BookName to "Unkown";
           - Author to "Unknown Author";
           - PublishedYear to 0 ; 

    - Write a parameterized constructor which accepts values for 		   
           - BookName,
		   - Author
		   - PublishedYear
		   
	- Overload the constructor to allow the creation of book object by providing only
           - BookName,
		   - Author	
	    In this case PublishedYear set to 0. 
		
	- Write main() inside class "BookDemo".	

 */

class Book {

    String bookName;
    String author;
    int publishedYear;

    Book() {
        bookName = "Unknown";
        author = "Unknown Author";
        publishedYear = 0;
    }

    Book(String b, String a, int p) {
        bookName = b;
        author = a;
        publishedYear = p;
    }

    Book(String b, String a) {
        bookName = b;
        author = a;
        publishedYear = 0;
    }

    void display() {
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Published Year: " + publishedYear);
        System.out.println();
    }
}

public class exercise2 {

    public static void main(String[] args) {

        Book b1 = new Book();
        Book b2 = new Book("Sherlock Holmes", "Sir Aurthor Connen Doyle", 1902);
        Book b3 = new Book("Wings of Fire", "A.P.J Abdul Kalam");

        b1.display();
        b2.display();
        b3.display();
    }
}
