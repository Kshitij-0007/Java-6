/*
	Exercise 14
- Define a class "Movie" with title, lead actor, and rating. 
- Accept 5 movies and display all movies with rating above 4.	

 */

import java.util.Scanner;

class Movie {

    String title;
    String leadActor;
    double rating;

    void inputData(String t, String a, double r) {
        title = t;
        leadActor = a;
        rating = r;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Lead Actor: " + leadActor);
        System.out.println("Rating: " + rating);
        System.out.println();
    }
}

public class exercise14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Movie[] movies = new Movie[5];

        for (int i = 0; i < 5; i++) {
            movies[i] = new Movie();

            System.out.println("Enter movie title:");
            String title = sc.nextLine();

            System.out.println("Enter lead actor:");
            String actor = sc.nextLine();

            System.out.println("Enter rating:");
            double rating = sc.nextDouble();
            sc.nextLine();

            movies[i].inputData(title, actor, rating);
        }

        System.out.println("\nMovies with rating above 4:\n");

        for (int i = 0; i < 5; i++) {
            if (movies[i].rating > 4) {
                movies[i].display();
            }
        }

        sc.close();
    }
}
