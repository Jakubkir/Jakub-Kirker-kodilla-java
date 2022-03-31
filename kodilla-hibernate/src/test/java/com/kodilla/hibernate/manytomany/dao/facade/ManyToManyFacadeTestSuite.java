package com.kodilla.hibernate.manytomany.dao.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.facade.ManyTomanyFacade;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManyToManyFacadeTestSuite {
    @Autowired
    private ManyTomanyFacade manyTomanyFacade;
    @Autowired
    private CompanyDao companyDao;
    @Test
    public void testFacade(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        Employee paulSmitho =new Employee("Paul", "Smitho");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");
        Company greyoMaster = new Company("Greyo Master");

        softwareMachine.getEmployees().add(johnSmith);
        softwareMachine.getEmployees().add(paulSmitho);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);
        greyoMaster.getEmployees().add(paulSmitho);


        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);
        paulSmitho.getCompanies().add(greyoMaster);
        paulSmitho.getCompanies().add(softwareMachine);

        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();
        companyDao.save(greyoMaster);
        int greyoMasterId=greyoMaster.getId();

        //When
        List<Employee> employees= manyTomanyFacade.retrieveEmployeeWithPartLastname("sky");
        List<Company> companies= manyTomanyFacade.retrieveCompanyWithPartName("oft");

        //Then
        assertEquals(1, employees.size());
        assertEquals("Kovalsky", employees.get(0).getLastname());

        assertEquals(1, companies.size());
        assertEquals("Software Machine", companies.get(0).getName());


        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
            companyDao.deleteById(greyoMasterId);
        } catch (Exception e) {
            //do nothing
        }
    }
}