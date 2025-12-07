package com.example.project;
import java.util.List;

public interface EmpService {
    String createEmployee(Employee employee); //create employee
    List<Employee> readEmployees(); //read all employees
    boolean deleteEmployee(Long id); //delete employee by id
    String updateEmployee(Long id, Employee employee);
    Employee readEmployee();
    Employee readEmployee(Long id);


}
