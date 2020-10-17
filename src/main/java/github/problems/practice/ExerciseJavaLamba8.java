package github.problems.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ExerciseJavaLamba8 {

  public static void main(String[] args) {

    List<Person> personList = Arrays.asList(
      new Person("Vikas", "Singh", 28),
      new Person("Bob", "Marley", 22),
      new Person("Tango", "Charlie", 29)
    );

    //Step1 Sort list by first name.
    Collections.sort(personList, Comparator.comparing(p -> p.firstName));
    printALL(personList, person -> true, person -> System.out.println(person));

    //Step2 Sort list by Age.
    Collections.sort(personList, (p1, p2) -> p1.age > p1.age ? -1 : 1);
    printALL(personList, person -> true, person -> System.out.println(person.age));

  }

  private static void printALL(List<Person> personList, Predicate<Person> predicate, Consumer<Person> consumer) {
    personList.forEach(p -> {
      if (predicate.test(p))
        consumer.accept(p);
    });
  }

  public static class Person {

    private String firstName;
    private String lastName;
    private int age;

    Person(String firstName, String lastName, int age) {
      super();
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
    }

    public int getAge() {
      return age;
    }

    public void setAge(int age) {
      this.age = age;
    }

    public String getFirstName() {
      return firstName;
    }

    public void setFirstName(String firstName) {
      this.firstName = firstName;
    }

    public String getLastName() {
      return lastName;
    }

    public void setLastName(String lastName) {
      this.lastName = lastName;
    }

    @Override public String toString() {
      return "Person{" +
        "firstName='" + firstName + '\'' +
        ", LastName='" + lastName + '\'' +
        ", age=" + age +
        '}';
    }
  }
}
