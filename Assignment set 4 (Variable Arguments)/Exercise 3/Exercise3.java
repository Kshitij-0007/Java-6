/*
		- Create a method printNames(String... names) that prints all names passed. Call it with:
			- Two names
			- Five names
			- No names
 */
public class Exercise3 {

    void printNames(String... names) {
        for (String it : names) {
            System.out.println("Name: " + it);
        }
    }

    public static void main(String[] args) {
        Exercise3 e = new Exercise3();
        e.printNames();
        e.printNames("Kshitij");
        System.out.println("");
        e.printNames("Kshitij", "Saddie");
        System.out.println("");
        e.printNames("Kshitij", "Saddie", "Ash");
        System.out.println("");
        e.printNames("Kshitij", "Saddie", "Ash", "Sara");
        System.out.println("");
    }
}
