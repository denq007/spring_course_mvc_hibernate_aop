package com.denismurashko.spring.mvc_hibernate_aop.controller;

import com.denismurashko.spring.mvc_hibernate_aop.dao.EmployeeDao;
import com.denismurashko.spring.mvc_hibernate_aop.entity.Employee;
import com.denismurashko.spring.mvc_hibernate_aop.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MyController {
  //  @Autowired
  //  private EmployeeDao employeeDao;
//теперь добавляем  сервис
   @Autowired
    private EmployeeService employeeService;
    @RequestMapping("/")
    public String showAllEmployees(Model model) {
        List<Employee> allEmployees = employeeService.getAllEmployees();
        model.addAttribute("allEmps",allEmployees);
        return "all-employees";
    }
}
