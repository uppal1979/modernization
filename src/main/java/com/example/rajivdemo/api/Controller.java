package com.example.rajivdemo.api;

import com.example.rajivdemo.model.Employee;
import com.example.rajivdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
        @GetMapping("/api/v1/hello")
        public String sayHello()
        {
            return "hello rajiv";
        }

    @Autowired
    EmployeeService empService;

    @RequestMapping(value = "/api/v1/employees", method = RequestMethod.GET)
    public List<Employee> firstPage() {

        return empService.getAllEmployees();

    }
    }

