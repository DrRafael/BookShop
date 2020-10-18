package org.javalearncourse.bookshop.repos;

import org.javalearncourse.bookshop.beans.PrintEdition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface PrintEditionRepo extends JpaRepository<PrintEdition, Integer> {



    @Query (value = "SELECT * FROM print_edition WHERE category = ?1 ORDER BY price", nativeQuery = true)
    Iterable<PrintEdition> findPrintEditionByPriceAndCategory(String printEditionCategory);

    @Query (value = "SELECT * FROM print_edition WHERE category = ?1 ORDER BY price DESC", nativeQuery = true)
    Iterable<PrintEdition> findPrintEditionByPriceAndCategoryDesc(String printEditionCategory);

    @Query (value = "SELECT * FROM print_edition ORDER BY price DESC", nativeQuery = true)
    Iterable<PrintEdition> findPrintEditionByPriceDesc();
}
