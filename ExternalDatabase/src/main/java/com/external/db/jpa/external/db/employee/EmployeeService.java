package com.external.db.jpa.external.db.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        List<Employee> employeeList = new ArrayList<>();
        employeeRepository.findAll().forEach(employeeList::add);
        return employeeList;
    }

    public Employee getEmployeeWithID(String employeeId) {
        return employeeRepository.findOne(employeeId);
    }

    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public boolean deleteEmployee(String employeeId) {
        if (employeeRepository.exists(employeeId)) {
            employeeRepository.delete(employeeId);
            return true;
        }
        return false;
    }
}
