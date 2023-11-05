package com.java.lambda;

import java.util.Date;

public class Employee {

    private Integer empId;
    private String name;
    private Date doj;

    public Employee(int empId, String name, Date doj) {
        super();
        this.empId = empId;
        this.name = name;
        this.doj = doj;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", name=" + name + ", doj=" + doj + "]";
    }


}
