/*

		- Implement a method concat(String... words) that joins all words into a single string separated by spaces.
        Example: concat("Java", "is", "fun") → "Java is fun"

 */
public class Exercise6 {

    void concat(String... words) {
        for (String word : words) {
            System.out.print(word + " ");
        }
    }

    public static void main(String[] args) {
        Exercise6 e = new Exercise6();
        e.concat();
        System.out.println("");
        e.concat("Hi");
        System.out.println("");
        e.concat("Java", "is", "Fun");
        System.out.println("");
        e.concat("I", "Love", "To", "Do", "Fun");
        System.out.println("");
    }
}
