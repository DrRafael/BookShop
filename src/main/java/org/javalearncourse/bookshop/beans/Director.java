package org.javalearncourse.bookshop.beans;

public class Director extends Person{

    public Director(String LastName, String name) {
       super(LastName, name);
    }
    public void printDirector(){
        System.out.println(getLastName() + " " + getName());
    }

}
