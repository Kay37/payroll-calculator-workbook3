package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class PayrollCalcMain {

    public static void main(String[] args) {

        //TODO: Open the employees.csv with FileReader * wrap it in a BufferedReader
        //TODO: & Read each line of text
        try {
            BufferedReader employeesInfo = new BufferedReader( new FileReader("employees.csv"));

            String employeesInfoLine;
            //* Have to skip the header that doesn't match the format order of operations in the .csv
            employeesInfo.readLine();
            while((employeesInfoLine = employeesInfo.readLine()) != null) {
                String[] employeesInfoArray = employeesInfoLine.split("\\|");
                String employeeID = employeesInfoArray[0];
                String employeeName = employeesInfoArray[1];
                double employeeHoursWorked =  Double.parseDouble(employeesInfoArray[2]);
                double employeepayRate = Double.parseDouble(employeesInfoArray[3]);
                Employee employee = new Employee(employeeID, employeeName, employeeHoursWorked, employeepayRate);

            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("Something went wrong while trying to read the employees.csv file");
        }

        //TODO: Split each line into individual fields using the | character as the delimiter
//        ArrayList<Employee> employees = new ArrayList<>();
//        employees.add()

        /*TODO: Copy the values from the tokens array into variables that match the data and then use them to create a
        new Employee Object
        */

        //TODO: Display the employee using a printf & by calling the employee's get methods for ID, name, and gross pay.

        //TODO: Repeat for each line in the input file.
    }

//    public static int getEmployeeID() {
//
//    }
//
//    public static double getGrossPay() {
//
//    }

}
