package com.acciojob.OfficeManagementApplication.Service;

import com.acciojob.OfficeManagementApplication.Model.Manager;
import com.acciojob.OfficeManagementApplication.Repository.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerService {
    @Autowired
    ManagerRepository managerRepository;
    public void addManager(Manager manager) {
        managerRepository.addManager(manager);
    }
    public Manager getManager(int managerId) {
      return managerRepository.getManager(managerId);
    }
    public void deleteManager(int managerId) {
        managerRepository.deleteManager(managerId);
    }
    public Manager managerReportees(int managerId) {
       return managerRepository.managerReportees(managerId);
    }
}
