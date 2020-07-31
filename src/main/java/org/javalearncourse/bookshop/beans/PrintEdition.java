package org.javalearncourse.bookshop.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class PrintEdition {
    @Id
    @GeneratedValue (strategy=GenerationType.AUTO)
    private  Integer id;

    private String title;
    private String author;
    private BigDecimal price;

    public PrintEdition() {

    }

    public PrintEdition(String title, String author, BigDecimal  price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal  price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return id + " " + title + " " + author;
    }
}

