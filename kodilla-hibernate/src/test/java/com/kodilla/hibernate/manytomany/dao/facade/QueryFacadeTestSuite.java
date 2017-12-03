package com.kodilla.hibernate.manytomany.dao.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.facade.QueryFacade;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QueryFacadeTestSuite {
    @Autowired
    QueryFacade queryFacade;

    @Test
    public void testQueryEmployeeWithAnyLetter() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        Employee jerryBukovsky = new Employee("Jerry", "Bukovsky");
        Employee lidiaLark = new Employee("Lidia", "Lark");

        //When
        queryFacade.saveEmployee(johnSmith);
        queryFacade.saveEmployee(stephanieClarckson);
        queryFacade.saveEmployee(lindaKovalsky);
        queryFacade.saveEmployee(jerryBukovsky);
        queryFacade.saveEmployee(lidiaLark);

        List<Employee> employees1 = queryFacade.retrieveEmployeesWithAnyLetters("%ar%");
        List<Employee> employees2 = queryFacade.retrieveEmployeesWithAnyLetters("%sky%");

        //Then
        assertEquals(2, employees1.size());
        assertEquals(2, employees2.size());

        //CleanUp
        queryFacade.deleteAllEmployees();
    }

    @Test
    public void testQueryCompanyWithAnyLetter() {
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        //When
        queryFacade.saveCompany(softwareMachine);
        queryFacade.saveCompany(dataMaesters);
        queryFacade.saveCompany(greyMatter);

        List<Company> companies1 = queryFacade.retrieveCompanyNameWithAnyLetter("%ma%");
        List<Company> companies2 = queryFacade.retrieveCompanyNameWithAnyLetter("%te%");

        //Then
        assertEquals(3, companies1.size());
        assertEquals(2, companies2.size());
    }
}
