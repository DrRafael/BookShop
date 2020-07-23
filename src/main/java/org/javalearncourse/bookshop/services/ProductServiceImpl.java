package org.javalearncourse.bookshop.services;

import org.javalearncourse.bookshop.beans.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {



    @Override
    public List<Product> getAllProducts() {
       Dbase db = new Dbase();

        return db.getAllProduct();
    }
}
