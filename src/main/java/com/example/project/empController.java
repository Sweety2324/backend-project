package com.example.project;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.data.jpa.domain.AbstractPersistable_.id;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
public class empController {

    //List<Employee> employees = new ArrayList<>();
    //EmpService employeeService = (EmpService) new EmployeeServiceImp();
    @Autowired
    private EmpService employeeService;
    // Using Dependency Injection to inject the service
    //Autowired
    //EmpService employeeService;

    @GetMapping("/employees") 
    public List<Employee> getAllEmployees() {
        return employeeService.readEmployees();
    }
    @GetMapping("/employees/{id}") 
    public Employee getEmployeeById(@PathVariable Long id) {
        return employeeService.readEmployee(id);
    }
    @PostMapping("/employees")
    public String createEmployee(@RequestBody Employee employee) {
        employeeService.createEmployee(employee);
        return "Employee created successfully";
    }
    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        if(employeeService.deleteEmployee(id))
            return "Employee deleted successfully";
        return "Employee not found";
    }
    @PutMapping("employees/{id}")
    public String putMethodName(@PathVariable Long id, @RequestBody Employee employee) {
        //TODO: process PUT request
        
        return employeeService.updateEmployee(id, employee);
    }
}
