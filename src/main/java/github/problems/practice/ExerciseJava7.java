package github.problems.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExerciseJava7 {

  public static void main(String[] args) {

    List<Person> personList = Arrays.asList(
      new Person("Vikas", "Singh", 28),
      new Person("Bob", "Marley", 22),
      new Person("Tango", "Charlie", 29)
    );

    //Step1 Sort list by first name.
    Collections.sort(personList, new Comparator<Person>() {
      @Override
      public int compare(Person o1, Person o2) {
        return o1.firstName.compareTo(o2.firstName);
      }
    });

    printALL(personList);

    //Step2 Sort list by Age.
    Collections.sort(personList, new Comparator<Person>() {
      @Override public int compare(Person o1, Person o2) {
        return o1.age < o2.age ? -1 : 1;
      }
    });
    printALL(personList);

  }

  private static void printALL(List<Person> personList) {
    for (Person p : personList) {
      System.out.println(p);
    }
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
