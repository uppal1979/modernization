package com.example.rajivdemo.service.impl;

import com.example.rajivdemo.dao.EmployeeDao;
import com.example.rajivdemo.model.Employee;
import com.example.rajivdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeDao employeeDao;

    public List<Employee> getAllEmployees() {
        List<Employee> employees = employeeDao.getAllEmployees();
        return employees;
    }
}
