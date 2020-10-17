package github.java.basics.comparable;

import java.util.Objects;

public class Movie implements Comparable<Movie> {

    private int rating;
    private int year;
    private String name;

    public int getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }


    public Movie(String name, int rating, int year) {
        this.rating = rating;
        this.year = year;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "rating=" + rating +
                ", year=" + year +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie that = (Movie) o;
        return rating == that.rating &&
                year == that.year &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rating, year, name);
    }

    @Override
    public int compareTo(Movie o) {
        return this.year - o.year;
    }
}
