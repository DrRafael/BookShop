package org.javalearncourse.bookshop.beans;

public class PrintEdition {
    private  int id;

    private String title;
    private String author;
    private double price;


    public PrintEdition(int id, String title, String author, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return id + " " + title + " " + author;
    }
}

