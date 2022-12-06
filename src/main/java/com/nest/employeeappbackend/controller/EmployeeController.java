package com.nest.employeeappbackend.controller;


import com.nest.employeeappbackend.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/")
    public String HomePage(){
        return "Welcome to Employee Home Page";
    }

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
        return "Welcome to Employee Add page";
    }


}
