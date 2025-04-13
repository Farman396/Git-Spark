package com.genie.JpaDemo.controller;

import com.genie.JpaDemo.entity.Employee;
import com.genie.JpaDemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService service;

    @GetMapping("/getAll")
    public List<Employee> getAllEmployee(){
        List<Employee> allEmp = service.getAllEmp();
        return allEmp;
    }

    @PostMapping("/save")
    public Employee createEmployee(@RequestBody Employee employee){
        Employee emp = service.createEmployee(employee);
        return emp;
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable int id){
        service.deleteEmployee(id);
    }

}
