package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class QueryFacade {
    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    public List<Company> retrieveCompanyNameWithAnyLetter(String letters) {
        return companyDao.retrieveCompanyNameWithAnyLetter(letters);
    }

    public List<Employee> retrieveEmployeesWithAnyLetters(String letters) {
        return employeeDao.retrieveEmployeesWithAnyLetters(letters);
    }

    public void saveEmployee(Employee employee) {
        employeeDao.save(employee);
    }

    public void saveCompany(Company company) {
        companyDao.save(company);
    }

    public void deleteAllEmployees() {
        employeeDao.deleteAll();
    }

    public void deleteAllCompanies() {
        companyDao.deleteAll();
    }

}
