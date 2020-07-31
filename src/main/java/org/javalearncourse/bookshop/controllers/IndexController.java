package org.javalearncourse.bookshop.controllers;


import org.javalearncourse.bookshop.beans.PrintEdition;
import org.javalearncourse.bookshop.repos.PrintEditionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class IndexController {
    @Autowired
    private PrintEditionRepo printEditionRepo;


    @GetMapping
    public String main(Map<String, Object> model){
        Iterable<PrintEdition> printEditions = printEditionRepo.findAll();
        model.put("printEdition",printEditions);

        return "index";
    }

}