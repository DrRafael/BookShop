package org.javalearncourse.bookshop.beans;

public class MainMethod {

    public static void main(String[] args) {
        Director director = new Director("Иванов", "Николай");
        Shop shop = new Shop("Дом книги", "Москва", director);

        shop.addBoook("Война и мир", "Лев" ,"Толстой",489.6, "A25");
        shop.addBoook("Атлант расправил пдечи", "Рэнд","Айн", 890.50,"A30");
        shop.addBoook("Чистый код", "Роберт","Мартин",560.50,"C10");


        shop.addNewspaper("Труд-7",10.50,"A1");
        shop.addNewspaper("Аргументы и факты",20.50,"A2");
        shop.addNewspaper("Вечерняя Москва",30.10,"A3");


        shop.addSeller("1", "Абрамов", "Егор",35000);
        shop.addSeller("2", "Костиков", "Павел", 20000);
        shop.addSeller("3", "Рудковская", "Елена",28000);
        shop.allProduct();
        shop.printInfoSeller();
        shop.printExpenciveProduct();
        shop.printCheapProduct();
        shop.averrage();
    }

}
