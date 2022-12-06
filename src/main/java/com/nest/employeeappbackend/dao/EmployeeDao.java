package com.nest.employeeappbackend.dao;

import com.nest.employeeappbackend.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<Employee, Integer> {
}
