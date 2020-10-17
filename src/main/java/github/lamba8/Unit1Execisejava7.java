package github.lamba8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1Execisejava7 {


    public static void main(String args[]) {

        List<Person> people = Arrays.asList(
                new Person("Ram", "S", 23),
                new Person("Jay", "R", 24),
                new Person("Kale", "A", 30));


        //Sort list by LastName.
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Math.max(o1.getEmpId(), o2.getEmpId());
            }
        });

        printAll(people);
        printAllLastName(people);

    }

    private static void printAll(List<Person> people) {

        for (Person p : people) {
            System.out.println(p);
        }
    }

    private static void printAllLastName(List<Person> people) {

        for (Person p : people) {
            System.out.println(p.getLastName().startsWith("A") ? p : "");
        }
    }
}
