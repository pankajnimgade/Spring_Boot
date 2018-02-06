package com.external.db.jpa.external.db.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public List<Employee> getAllEmployeeList() {
        return employeeService.getAllEmployees();
    }

    @RequestMapping(value = "/employees", method = RequestMethod.POST)
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    @RequestMapping(value = "/employees/{employeeId}", method = RequestMethod.GET)
    public Employee getEmployeeWithId(@PathVariable String employeeId) {
        return employeeService.getEmployeeWithID(employeeId);
    }

    @RequestMapping(value = "/employees/{employeeId}", method = RequestMethod.PUT)
    public Employee updateEmployee(@PathVariable String employeeID,@RequestBody Employee employee) {
        return employeeService.updateEmployee(employee);
    }

    @RequestMapping(value = "/employees/{employeeId}", method = RequestMethod.DELETE)
    public boolean deleteEmployee(@PathVariable String employeeId) {
        return employeeService.deleteEmployee(employeeId);
    }
}
