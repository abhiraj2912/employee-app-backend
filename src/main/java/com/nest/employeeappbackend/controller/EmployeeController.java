package com.nest.employeeappbackend.controller;


import com.nest.employeeappbackend.dao.EmployeeDao;
import com.nest.employeeappbackend.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
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
    public HashMap<String, String> EmployeeAdd(@RequestBody Employee e){
        dao.save(e);
        HashMap<String,String> map = new HashMap<>();
        map.put("status","success");
        return map;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Employee> ViewAll(){
        return (List<Employee>) dao.findAll();
    }




}
