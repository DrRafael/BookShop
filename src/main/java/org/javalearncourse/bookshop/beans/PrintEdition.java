package org.javalearncourse.bookshop.beans;

public class PrintEdition {

        private String name;
        private int id;
        private double price;
        private String rack;
        private  String department;

    public PrintEdition(int id, String name, double price, String rack, String department) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.rack = rack;
        this.department = department;
    }

    public void printInfo(){
        System.out.println(getId()+ ", "+getName()+", Цена "+ getPrice()+ ", Отдел: "+getDepartment()  );

    }
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRack() {
        return rack;
    }

    public void setRack(String rack) {
        this.rack = rack;
    }
}


