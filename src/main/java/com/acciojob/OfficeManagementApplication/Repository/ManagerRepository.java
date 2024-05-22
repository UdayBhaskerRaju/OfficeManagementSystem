package com.acciojob.OfficeManagementApplication.Repository;

import com.acciojob.OfficeManagementApplication.Model.Manager;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ManagerRepository {
    Map<Integer,Manager> managerDb = new HashMap<>();
    public void addManager(Manager manager) {
        managerDb.put(manager.getManagerID(),manager);
    }
    public Manager getManager(int managerId) {
        return managerDb.get(managerId);

    }
    public void deleteManager(int managerId) {
        managerDb.remove(managerId);
    }

    public Manager managerReportees(int managerId) {
       Manager manager = managerDb.get(managerId);
       int reporters =(int)(Math.random()*10);
       manager.setNumberOfReportees(reporters);
       return manager;
    }
}
