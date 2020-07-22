package org.javalearncourse.bookshop.beans;

import java.util.ArrayList;
import java.util.List;

public  class Shop {

    private String name;
    private String address;
    private Director director;
    //private int currentCountOfSeller;

    private int id = 1587;


    private List<PrintEdition> editions = new ArrayList<>();
    private ArrayList<Seller> sellers = new ArrayList<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Shop(String name, String address, Director director) {
        this.name = name;
        this.address = address;
        this.director = director;
        System.out.println();
    }

    public void printInfoSeller() {
        for (int i = 0; i < sellers.size(); i++) {
            Seller s = sellers.get(i);
            System.out.println(s.getId() + ") " + s.getLastName() + " " + s.getName() + " "+ s.getSalary());
        }
    }

    public void addBoook(String name, String authorName, String authorLastname, double price, String rank) {
       // Book book = new Book(id, name, price, rank, "Книжный  отдел");
        //book.addAuthor(authorName, authorLastname);
        //editions.add(book);
        id++;
    }

    public void addMagazine(String name, double price, String rack) {
        Magazine magazine = new Magazine(id, name, price, rack, "Газетный отдел");
        editions.add(magazine);
        id++;
    }

    public void addNewspaper(String name, double price, String rack) {
        Newspaper newspaper = new Newspaper(id, name, price, rack, "Газетный отдел" );
        editions.add(newspaper);
        id++;
    }


    public void addSeller(String id, String lastName, String name, int salary) {
        Seller seller = new Seller(id, lastName, name,salary);
        sellers.add(seller);
    }
    public void allProduct(){
        for (int i = 0; i < editions.size(); i++) {
            PrintEdition p = editions.get(i);
            p.printInfo();
        }

    }
    public void printExpenciveProduct(){
         PrintEdition max = editions.get(0);
        for (int i = 1; i < editions.size() ; i++) {
            if (max.getPrice() <  editions.get(i).getPrice()){
                max = editions.get(i);

            }

        }
        max.printInfo();
    }
    public void printCheapProduct(){
        PrintEdition min = editions.get(0);
        for (int i = 1; i < editions.size(); i++) {
            if (min.getPrice() > editions.get(i).getPrice()){
                min = editions.get(i);
            }
        }
        min.printInfo();
    }

    public  void  averrage(){
        int averrage = 0;
        int sum = 0;
        for (int i = 0; i < sellers.size(); i++) {
            if (sellers.get(i).getSalary() > 0) {
                sum +=sellers.get(i).getSalary();
            }
        }
        averrage = sum / sellers.size();
        System.out.println("Средняя заработная плата: " + averrage);
        }
    }