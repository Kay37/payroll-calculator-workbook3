package com.pluralsight;

public class Employee {

    private String employeeId;
    private String name;
    private double hoursWorked;
    private double PayRate;

    public Employee(String employeeId, String name, double hoursWorked, double PayRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.PayRate = PayRate;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return PayRate;
    }


    public void setPayRate(double PayRate) {
        this.PayRate = PayRate;
    }

    public double getGrossPay() {
        return hoursWorked * PayRate;
    }

}
