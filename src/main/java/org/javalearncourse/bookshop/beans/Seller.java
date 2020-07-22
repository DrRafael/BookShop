package org.javalearncourse.bookshop.beans;

public class Seller extends Person{

    private String  id;
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Seller(String id, String lastName, String name, int salary) {
        super(lastName, name);
        this.id = id;
        this.salary = salary;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }








}
