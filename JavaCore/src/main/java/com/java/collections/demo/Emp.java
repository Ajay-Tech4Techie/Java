package com.java.collections.demo;

public class Emp implements Comparable<Emp> {
    private int empId;
    private String empName;

    public Emp(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    @Override
    public int hashCode() {
        System.out.println("inside hashCode()...");
        return 31 + empId;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("inside equals()...");
        if ((obj instanceof Emp) && (this.empId == ((Emp) obj).empId) && (this.empName == ((Emp) obj).empName))
            return true;
        else
            return false;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public int compareTo(Emp o) {

        return 0;
    }

}
