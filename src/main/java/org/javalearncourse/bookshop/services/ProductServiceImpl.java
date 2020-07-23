package org.javalearncourse.bookshop.services;

import org.javalearncourse.bookshop.beans.PrintEdition;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    List<PrintEdition> printEditions = new ArrayList<>();

    @Override
    public List<PrintEdition> getAllProducts() {

        return printEditions;
    }
}
