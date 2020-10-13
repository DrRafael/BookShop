package org.javalearncourse.bookshop.repos;

import org.javalearncourse.bookshop.beans.PrintEdition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface PrintEditionRepo extends JpaRepository<PrintEdition, Integer> {


    @Query (value = "SELECT * FROM print_edition WHERE category = ?1", nativeQuery = true)
    Iterable<PrintEdition> findByPrintEditionByCategory( String category);



}
//SELECT * FROM print_edition where "какое тополе"=?1