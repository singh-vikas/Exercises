package github.lamba8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Unit1Execisejava8 {


    public static void main(String args[]) {

        List<Person> people = Arrays.asList(
                new Person("Ram", "S", 23),
                new Person("Jay", "R", 24),
                new Person("Kale", "A", 30));


        //Sort list by LastName.
        Collections.sort(people, Comparator.comparing(Person::getLastName)) ;

        printAll(people, person -> person.getLastName().startsWith("A"));
    }

    private static void printAll(List<Person> people, Predicate<Person> predicate) {

        for (Person p : people) {
            if (predicate.test(p)) {
                System.out.println(p);
            }
        }
    }

}
