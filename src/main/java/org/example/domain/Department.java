package org.example.domain;

public class Department {

    private String managerID;
    private DepartmentType departmentType;

    public Department(String managerID, DepartmentType departmentType) {
        this.managerID = managerID;
        this.departmentType = departmentType;
    }

    public String getManagerID() {return managerID;}

    public DepartmentType getDepartment() {return departmentType;}

    @Override
    public String toString() {
        return "DepartmentClass{" +
                "managerID='" + managerID + '\'' +
                ", department=" + departmentType +
                '}';
    }
}
