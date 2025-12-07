/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.example.project;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;

@Service
public class EmployeeServiceImp implements EmpService {
    @Autowired
    private EmployeeRepository employeeRepository;

    List<Employee> employees = new ArrayList<>();
    @Override
    public String createEmployee(Employee employee) {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        BeanUtils.copyProperties(employee, employeeEntity);
        //employees.add(employee);
        employeeRepository.save(employeeEntity);
        return "Employee created";
    }

    @Override
    public List<Employee> readEmployees() {
        List<EmployeeEntity> employeeEntities = employeeRepository.findAll();
        List<Employee> employees = new ArrayList<>();
        for (EmployeeEntity entity : employeeEntities) {
            Employee emp = new Employee();
            emp.setId(entity.getId());
            emp.setName(entity.getName());
            emp.setPhone(entity.getPhone());
            emp.setEmail(entity.getEmail());
            // BeanUtils.copyProperties(entity, emp);
            employees.add(emp);
        }
        return employees;
    }

    @Override
    public boolean deleteEmployee(Long id) {
        EmployeeEntity emp = employeeRepository.findById(id).get();
        employeeRepository.delete(emp);

        return true;
    }

    @Override
    public String updateEmployee(Long id, Employee employee) {
        EmployeeEntity existingEmployee = employeeRepository.findById(id).get();
        existingEmployee.setName(employee.getName());
        existingEmployee.setPhone(employee.getPhone());         
        existingEmployee.setEmail(employee.getEmail());
        
        employeeRepository.save(existingEmployee);

        return "update successful";
    }

    @Override
    public Employee readEmployee() {
        // TODO Auto-generated method stub
        EmployeeEntity employeeEntity = employeeRepository.findAll().get(0);
        Employee emp = new Employee();
        BeanUtils.copyProperties(employeeEntity, emp);
        return emp;
    }

    @Override
    public Employee readEmployee(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readEmployee'");
    }
}
