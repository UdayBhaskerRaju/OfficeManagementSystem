package com.acciojob.OfficeManagementApplication.Service;

import com.acciojob.OfficeManagementApplication.Model.Employee;
import com.acciojob.OfficeManagementApplication.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    public void addEmployee(Employee employee) {
        employeeRepository.addEmployee(employee);
    }
    public Employee getEmployee(int empId) {
       return employeeRepository.getEmployee(empId);
    }
    public void deleteEmployee(int empId) {
        employeeRepository.deleteEmployee(empId);
    }
    public Employee updateSalary(int empId, int newSal) {
        return employeeRepository.updateSalary(empId,newSal);
    }
    public Employee highestSalary() {
        return employeeRepository.highestSalary();
    }
}
