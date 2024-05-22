package com.acciojob.OfficeManagementApplication.Model;

public class Manager {

    private int managerID;
    private String name;
    private int age;
    private String gender;
    private int numberOfReportees;
    private String department;

    public Manager() {

    }
    public Manager(int managerID, String name,
                   int age, String gender,
                   int numberOfReportees, String department) {
        this.managerID = managerID;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.numberOfReportees = numberOfReportees;
        this.department = department;
    }
    public int getManagerID() {
        return managerID;
    }

    public void setManagerID(int managerID) {
        this.managerID = managerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getNumberOfReportees() {
        return numberOfReportees;
    }

    public void setNumberOfReportees(int numberOfReportees) {
        this.numberOfReportees = numberOfReportees;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
