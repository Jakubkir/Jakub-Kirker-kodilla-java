package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public  class ManyTomanyFacade {
    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    CompanyDao companyDao;

    public List<Company> retrieveCompanyWithPartName(String partCName) {
        return companyDao.retrieveCompanyWithPartName(partCName);
    }

    public List<Employee> retrieveEmployeeWithPartLastname(String partLastname) {
        return employeeDao.retrieveEmployeeWithPartLastName(partLastname);
    }

}