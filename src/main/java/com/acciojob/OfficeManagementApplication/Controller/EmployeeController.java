package com.acciojob.OfficeManagementApplication.Controller;

import com.acciojob.OfficeManagementApplication.Model.Employee;
import com.acciojob.OfficeManagementApplication.Model.Manager;
import com.acciojob.OfficeManagementApplication.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;
    @PostMapping("/add-employee")
    public String addEmployee(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
        return "Employee Registered  Successfully";
    }
    @GetMapping("/get-employee")
    public Employee getEmployee(@RequestParam("id") int empId){
        return employeeService.getEmployee(empId);
    }
    @DeleteMapping("/delete-employee/{id}")
    public String deleteEmployee(@PathVariable("id") int empId){
        employeeService.deleteEmployee(empId);
        return "Employee deleted Successfully";
    }
    @PutMapping("/update-salary")
    public Employee updateSalary(@RequestParam("id") int empId,
                                 @RequestParam("salary") int newSal){
        return employeeService.updateSalary(empId,newSal);
    }

    @GetMapping("/emp-highest-salary")
    public Employee highestSalary(){
      return employeeService.highestSalary();
    }
}
