package org.javalearncourse.bookshop.beans;

public class Person  {
    private String name;
    private String lastName;

    public Person(String lastName, String name) {
        this.name = lastName;
        this.lastName = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
