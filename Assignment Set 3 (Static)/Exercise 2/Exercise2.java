/*
    - Create a class "Library" having members:
	    - static int totalBooks: which tracks the number of books. 
	    - static int addBooks(int count): to add books in library.
	    - int getBook(): to get the book from library.
	- Ensure that whenever getBook method implemets it decreases the totalBook count.
    - Create another class "Test" which test the functions to add and get the books and display the counts of books at the end. 
*/
class Library{
    static int totalBooks=0;
    static int addBooks(int count){
        totalBooks+=count;
        return totalBooks;
    }
    static int getBook()
    {
        totalBooks--;
        return totalBooks;
    }
}
public class Exercise2{
    public static void main(String[] args) {
        int books=Library.totalBooks;
        System.out.println("The Library has current book count: "+books);
        books=Library.addBooks(100);
        System.out.println("The Library has current book count: "+books);
        books=Library.getBook();
        System.out.println("The Library has current book count: "+books);
    }
}