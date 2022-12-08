package com.nest.employeeappbackend.dao;

import com.nest.employeeappbackend.model.Employee;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDao extends CrudRepository<Employee, Integer> {

    @Query(value = "SELECT `id`, `company_name`, `designation`, `emp_code`, `mobile_no`, `name`, `password`, `salary`, `username` FROM `employees` WHERE `emp_code`=:empcode", nativeQuery = true)
    List <Employee> SearchEmployee(@Param("empcode") Integer empcode);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM `employees` WHERE `id`= :id",nativeQuery = true)
    void deleteEmployee(@Param("id") Integer id);
}
