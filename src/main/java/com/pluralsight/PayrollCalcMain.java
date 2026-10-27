package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;

public class PayrollCalcMain {

    public static void main(String[] args) {

        //! Open the employees.csv with FileReader * wrap it in a BufferedReader
        //! & Read each line of text
        try {
            BufferedReader employeesInfo = new BufferedReader(new FileReader("employees.csv"));

            String employeesInfoLine;
            //* Have to skip the header that doesn't match the format order of operations in the .csv
            employeesInfo.readLine();
            while ((employeesInfoLine = employeesInfo.readLine()) != null) {
                String[] employeesInfoArray = employeesInfoLine.split("\\|");
                String employeeId = employeesInfoArray[0];
                String employeeName = employeesInfoArray[1];
                double employeeHoursWorked = Double.parseDouble(employeesInfoArray[2]);
                double employeePayRate = Double.parseDouble(employeesInfoArray[3]);
                Employee employee = new Employee(employeeId, employeeName, employeeHoursWorked, employeePayRate);
                System.out.printf("Employee ID: %s\nEmployee Name: %s\nEmployee Gross Pay: $%.2f\n\n", employee.getEmployeeId(), employee.getName(), employee.getGrossPay());
            }
            employeesInfo.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Something went wrong while trying to read the employees.csv file");
        }

    }

}