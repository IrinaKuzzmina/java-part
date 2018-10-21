package com.academy.telesens.Homework06;

public class Abonent {
    private long id = -1;
    private String firstName;
    private String lastName;
    private int age;
    private char gender;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Abonent(long id,
                   String firstName,
                   String lastName,
                   int age,
                   char gender) {

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public Abonent(String firstName,
                   String lastName,
                   int age,
                   char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public void print() {
        System.out.printf("First Name: %s\n Last Name: %s\n Age: %d\n Gender: %c", firstName, lastName, age, gender);
    }

    public boolean isEquals(Abonent abonent) {
        if (this.id == abonent.id && this.id != -1) {
            System.out.println("This is the same abonent");
            return true;
        } else {
            System.out.println("Abonents are different");
            return false;
        }
    }
}
