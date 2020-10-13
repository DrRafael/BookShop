package org.javalearncourse.bookshop.controllers;


import org.javalearncourse.bookshop.beans.PrintEdition;
import org.javalearncourse.bookshop.repos.PrintEditionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.Map;


@Controller
@ControllerAdvice
public class IndexController {

    @Autowired
    private PrintEditionRepo printEditionRepo;



    @RequestMapping
    public String main(Map<String, Object> model){
        Iterable<PrintEdition> printEditions = printEditionRepo.findAll();
        model.put("printEdition",printEditions);

        return "index";
    }



    @RequestMapping(value = "/filter/{printEditionCategory}", method = RequestMethod.GET)
    public String filter(@PathVariable  String printEditionCategory, Map<String, Object> model){

        Iterable<PrintEdition> printEditions = printEditionRepo.findByPrintEditionByCategory(printEditionCategory);
        model.put("printEdition",printEditions);
        System.out.println("!!!!!!!!!" + printEditionCategory);

        return "index";

    }
}