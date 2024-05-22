package com.acciojob.OfficeManagementApplication.Controller;

import com.acciojob.OfficeManagementApplication.Model.Manager;
import com.acciojob.OfficeManagementApplication.Service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/manager")
public class ManagerController {
    @Autowired
    ManagerService managerService;
    @PostMapping("/add-manager")
    public String addManager(@RequestBody Manager manager){
        managerService.addManager(manager);
        return "Manager Registered Successfully";
    }
    @GetMapping("/get-manager")
    public Manager getManager(@RequestParam("id") int managerId){
       return managerService.getManager(managerId);
    }
    @DeleteMapping("/delete-manager/{id}")
    public String deleteManager(@PathVariable("id") int managerId){
        managerService.deleteManager(managerId);
        return "Manager Record deleted Successfully";
    }
    @PutMapping("/manager-reportees")
    public Manager managerReportees(@RequestParam("id") int managerId){
       return managerService.managerReportees(managerId);
    }
}
