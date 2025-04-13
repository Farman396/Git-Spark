package com.genie.JpaDemo.service;

import com.genie.JpaDemo.entity.Employee;
import com.genie.JpaDemo.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    public List<Employee> getAllEmp(){
        List<Employee> listEmp = employeeRepo.findAll();
        System.out.println(listEmp);
        return listEmp;
    }

    public Employee createEmployee(Employee employee) {
        Employee emp = employeeRepo.save(employee);
        return emp;
    }

    public void deleteEmployee(int id) {
        employeeRepo.deleteById(id);
    }
}
