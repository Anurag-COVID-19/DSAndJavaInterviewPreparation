package com.bean;

import java.util.Set;

public class Employee {

    private String empId;

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public Set<Department> getDepartments() {
        return departments;
    }

    public Employee(String empId, Set<Department> departments) {
        this.empId = empId;
        this.departments = departments;
    }

    public void setDepartments(Set<Department> departments) {
        this.departments = departments;
    }

    private Set<Department> departments;


}
