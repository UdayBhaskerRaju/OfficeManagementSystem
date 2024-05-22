package com.acciojob.OfficeManagementApplication.Repository;

import com.acciojob.OfficeManagementApplication.Model.Employee;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class EmployeeRepository {
    Map<Integer, Employee> empDb = new HashMap<>();
    public Employee addEmployee(Employee employee){
        empDb.put(employee.getEmpId(),employee);
        return employee;
    }
    public Employee getEmployee(int empId) {
        return empDb.get(empId);
    }
    public void deleteEmployee(int empId) {
        empDb.remove(empId);
    }
    public Employee updateSalary(int empId, int newSal) {
        Employee employee = empDb.get(empId);
        employee.setSalary(newSal);
        return employee;
    }
    public Employee highestSalary() {
        int maxSalary = 0;
        Employee highestPaidEmp = null;
        for(int empId: empDb.keySet()){
           Employee currEmp = empDb.get(empId);
           if(currEmp.getSalary() > maxSalary){
               maxSalary = (int) currEmp.getSalary();
               highestPaidEmp = currEmp;
           }
        }
        return highestPaidEmp;
    }
}
