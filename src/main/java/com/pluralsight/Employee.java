package com.pluralsight;

public class Employee {

    private String employeeID;
    private String fullName;
    private double hoursWorked;
    private double payRate;

    public Employee(String employeeID, String fullName, double hoursWorked, double payRate) {
        this.employeeID = employeeID;
        this.fullName = fullName;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

}
