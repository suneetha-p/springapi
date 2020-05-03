package com.springboot.controller;

import com.springboot.business.EmployeeServiceTest;
import com.springboot.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
@RestController

public class RestControllerTest {
    @Autowired(required = true)
    private EmployeeServiceTest employeeService;

    @GetMapping("/getTest")
    public String testGet(){
        return "hi from get";
    }

    @RequestMapping("/getEmpList")
    public List<Employee> getEmpList(){
        return Arrays.asList(new Employee("1","sunitha","punggolField"),new Employee("2","Arjun","sengkang"),
                new Employee("3","Abhiram","kovan"));
    }
    @RequestMapping("/getAllEmployee")
    public List<Employee>  getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @RequestMapping(value = "/getEmployee/{id}")

    public Employee getEmployee(@PathVariable String id){
        return employeeService.getEmployee(id);
    }

    @RequestMapping(method=RequestMethod.POST,value = "/addEmployee")
    public void addEmployee(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
    }

    @RequestMapping(method=RequestMethod.PUT,value="/putEmployee")
    public void replaceEmployee(@RequestBody Employee Employee){
        employeeService.replaceEmployee(Employee);
    }


}
