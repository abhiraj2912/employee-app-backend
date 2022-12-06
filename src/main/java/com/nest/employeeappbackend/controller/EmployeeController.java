package com.nest.employeeappbackend.controller;


import com.nest.employeeappbackend.dao.EmployeeDao;
import com.nest.employeeappbackend.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeDao dao;

    @GetMapping("/")
    public String HomePage(){
        return "Welcome to Employee Home Page";
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add", consumes = "application/json", produces = "application/json")
    public String EmployeeAdd(@RequestBody Employee e){
        System.out.println(e.getEmpCode());
        System.out.println(e.getName());
        System.out.println(e.getDesignation());
        System.out.println(e.getSalary());
        System.out.println(e.getCompanyName());
        System.out.println(e.getMobileNo());
        System.out.println(e.getUsername());
        System.out.println(e.getPassword());
        dao.save(e);
        return "Welcome to Employee Add page";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Employee> ViewAll(){
        return (List<Employee>) dao.findAll();
    }




}
