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

    @GetMapping("/search")
    public String EmployeeSearch(){
        return "Welcome to search Page";
    }


    @GetMapping("/edit")
    public String EmployeeEdit(){
        return "Welcome to edit page";
    }

    @GetMapping("/view")
    public String EmployeeView(){
        return "Welcome to View page";
    }

    @GetMapping("/delete")
    public String EmployeeDelete(){
        return "welcome to delete Page";
    }

}
