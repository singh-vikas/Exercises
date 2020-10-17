package github.lamba8;

import java.util.Objects;

public class Person {

    private String fisrtName;
    private String lastName;
    private int empId;

    public Person(String fisrtName, String lastName, int empId) {
        this.fisrtName = fisrtName;
        this.lastName = lastName;
        this.empId = empId;
    }

    public String getFisrtName() {
        return fisrtName;
    }

    public void setFisrtName(String fisrtName) {
        this.fisrtName = fisrtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fisrtName='" + fisrtName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", empId='" + empId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return fisrtName.equals(person.fisrtName) &&
                lastName.equals(person.lastName) &&
                empId == person.empId ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fisrtName, lastName, empId);
    }
}
