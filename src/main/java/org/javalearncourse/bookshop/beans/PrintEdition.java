package org.javalearncourse.bookshop.beans;

import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="print_edition")
public class PrintEdition {
    @Id
    @GeneratedValue (strategy=GenerationType.AUTO)

    private  Integer id;
    private String title;
    private String author;
    private int price;

    public PrintEdition() {

    }

    public PrintEdition(String title, String author, int price) {
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int  price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return id + " " + title + " " + author;
    }
}

