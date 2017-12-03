package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CompanyDao extends CrudRepository<Company, Integer> {
    @Query
    List<Company> retrieveCompanyNameWithSpecificLetters(@Param("LETTERS") String letters);

    @Query
    List<Company> retrieveCompanyNameWithAnyLetter(@Param("LETTERS") String letters);
}
