package com.springboot.business;

import com.springboot.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeServiceTest {

    private  List<Employee> empList= new ArrayList<>(Arrays.asList(new Employee("1","sunitha","punggolField"),new Employee("2","Arjun","sengkang"),
            new Employee("3","Abhiram","kovan")));

    public List<Employee>  getAllEmployee(){
        return empList;
    }


    public Employee getEmployee(String id){
       return empList.stream().filter(e->e.getId().equals(id)).findFirst().get();

    }

    public void addEmployee(Employee employee) {
        empList.add(employee);
    }

    public void replaceEmployee(Employee Employee){
    }
}
