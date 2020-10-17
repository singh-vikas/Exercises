package github.java.basics.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortedMovies {

    public static void main(String args[]) {

        List<Movie> movies = new ArrayList<>();

        movies.add(new Movie("Force Awakens", 8, 2015));
        movies.add(new Movie("Star Wars", 7, 1977));
        movies.add(new Movie("Empire Strikes Back", 3, 1980));
        movies.add(new Movie("Return of the Jedi", 5, 1983));


        // Comparable interface compares “this” reference with the object specified

        // Comparable is meant for objects with natural ordering
        // which means the object itself must know how it is to be ordered.
        // For example Roll Numbers of students.
        // Whereas, Comparator interface sorting is done through a separate class.


       // Collections.sort(movies);

       // movies.forEach(System.out::println);


        Collections.sort(movies, new NameComparison());
        //Collections.sort(movies, new RatingComparison());

        //Comparator in Java compares two different class objects provided.

//        for (Movie movie : movies) {
//            System.out.println(movie);
//        }
        movies.forEach(System.out::println);

    }

    static class RatingComparison implements Comparator<Movie> {
        @Override
        public int compare(Movie m1, Movie m2) {

            if (m1.getRating() > m2.getRating()) {
                return -1;
            } else {
                return 1;
            }

        }
    }

    static class NameComparison implements Comparator<Movie> {

        @Override
        public int compare(Movie m1, Movie m2) {
            //return m1.getName().length() - m2.getName().length();
            return m1.getName().compareTo(m2.getName());
        }
    }
}
