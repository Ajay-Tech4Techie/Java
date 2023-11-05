package com.java.core.core.java;

import java.io.Serializable;


public class Employee extends User implements Serializable//,Comparable<Employee>
{
    private static final long serialVersionUID = 167689L;

    private String employeeName;

    {
        System.out.println("Initializer ");
    }

    public String toString() {
        return "\n Employee Number " + employeeName + " Employee Name " + employeeName;
    }

    @Override
    public int hashCode() {
        int hashcode = 0;
        System.out.println("inside hascode");
        return userID + 17;
    }

    public boolean equals(Object obj) {
        //null instanceof Object will always return false
        System.out.println("inside equals");
        if (!(obj instanceof Employee))
            return false;
        if (obj == this)
            return true;
        return this.employeeName == ((Employee) obj).employeeName && this.employeeName == ((Employee) obj).employeeName;
    }
    
	/*   @Override
	public int compareTo(Employee emp) {
		return this.employeeName.compareTo(emp.getEmployeeName()) ;
	}*/


    static {
        System.out.println("Employee class Static Block only once when class is loaded");
    }

    public Employee() {
        System.out.println("Employee - DC");

    }

    public Employee(int empNo, String empName) {
        System.out.println("Employee - 2 Arg C");
        userID = empNo;
        employeeName = empName;

    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

}
