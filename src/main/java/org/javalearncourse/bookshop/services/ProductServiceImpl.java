package org.javalearncourse.bookshop.services;

import org.javalearncourse.bookshop.beans.PrintEdition;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {



    @Override
    public List<PrintEdition> getAllProducts() {
        Dbase db = new Dbase();
        return db.getAllProduct();
    }
}
