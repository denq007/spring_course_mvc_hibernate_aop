package com.denismurashko.spring.mvc_hibernate_aop.dao;

import com.denismurashko.spring.mvc_hibernate_aop.entity.Employee;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
  //  @Transactional  переместили в сервис
    public List<Employee> getAllEmployees() {
        Session session = sessionFactory.getCurrentSession();
       List<Employee> allEmployees = session.createQuery("from Employee", Employee.class).
                getResultList();

     //   Query<Employee> query=session.createQuery("from Employee",Employee.class);
     //   List<Employee> list=query.getResultList();

        return allEmployees;

    }
}
