package org.javalearncourse.bookshop.controllers;

import org.javalearncourse.bookshop.beans.PrintEdition;
import org.javalearncourse.bookshop.repos.PrintEditionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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


    @RequestMapping(value = "/filter", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String filterCategory(@RequestParam("category")  String printEditionCategory, @RequestParam("pricesort")  String priceSort, Map<String, Object> model){

        Iterable<PrintEdition> printEditions = null ;

        if (printEditionCategory.equals("all")){
            if (priceSort!= null && priceSort.equals("decrease")){
                printEditions = printEditionRepo.findPrintEditionByPriceDesc();
            } else {
                printEditions = printEditionRepo.findAll();
            }
        } else {
            if (priceSort.equals("decrease")){
                printEditions = printEditionRepo.findPrintEditionByPriceAndCategoryDesc(printEditionCategory);
            } else {
                printEditions = printEditionRepo.findPrintEditionByPriceAndCategory(printEditionCategory);
            }
        }

        model.put("printEdition",printEditions);


        return "index";

    }
}