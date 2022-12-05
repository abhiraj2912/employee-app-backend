package com.nest.employeeappbackend.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/")
    public String HomePage(){
        return "Welcome to Employee Home Page";
    }

    @GetMapping("/add")
    public String EmployeeAdd(){
        return "Welcome to Employee Add page";
    }

}
