package com.cybertek.tests.Homeworks.assignment14_oop;

public class Q4_Person {

    private String firstName;
    private String lastName;
    private  int age;

    public Q4_Person() {
        this.firstName = "undefined";
        this.lastName = "undefined";
        this.age = -1;
    }

    public Q4_Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return firstName + "|" +lastName + "|" + age;
    }


    public static void main(String[] args) {

        Q4_Person person = new Q4_Person();

        System.out.println(person.getFirstName()); //"undefined"
        System.out.println(person.getLastName()); //"undefined"
        System.out.println(person.getAge()); // -1
        System.out.println(person.toString()); //"undefined | undefined | -1"

        person.setFirstName("John");
        person.setLastName("Doe");
        person.setAge(44);

        System.out.println(person.toString() ); // "John | Doe | 44"

        Person person2 = new Person("Fatima", "Lee", 22);

        System.out.println(person2.getFirstName()); //"Fatima"
        System.out.println(person2.getLastName()); //"Lee"
        System.out.println(person2.getAge()); // 22
        System.out.println(person2.toString()); //"Fatima | Lee | 22"

    }
}
