package com.denismurashko.spring.mvc_hibernate_aop.service;

import com.denismurashko.spring.mvc_hibernate_aop.dao.EmployeeDao;
import com.denismurashko.spring.mvc_hibernate_aop.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class EmplayeeServeceImple implements EmployeeService{
   //используем DAO
    @Autowired
    private EmployeeDao employeeDao;
    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDao.getAllEmployees();
    }
}
