package com.pluralsight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class PayrollCalcMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Payroll Calculator!");
        System.out.println("Please enter the name of the input file for Payroll Calculations: ");
        String inputFile = sc.nextLine();

        System.out.println("Please enter the name of the output file for Payroll Calculations: ");
        String outputFile = sc.nextLine();


        if (inputFile.equals(outputFile)) {
            System.out.println("You have entered duplicate names for the input and output files. Try again. ");
            return;
        }
        try {
            BufferedReader eReader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter eWriter = new BufferedWriter(new FileWriter(outputFile));

            String employeesInfoLine;
            //* Have to skip the header that doesn't match the format order of operations in the .csv
            eReader.readLine();
            eWriter.write("id|name|gross pay\n");
            while ((employeesInfoLine = eReader.readLine()) != null) {
                String[] employeesInfoArray = employeesInfoLine.split("\\|");
                String employeeId = employeesInfoArray[0];
                String employeeName = employeesInfoArray[1];
                double employeeHoursWorked = Double.parseDouble(employeesInfoArray[2]);
                double employeePayRate = Double.parseDouble(employeesInfoArray[3]);
                Employee employee = new Employee(employeeId, employeeName, employeeHoursWorked, employeePayRate);
                //* for 10/27/2026 we just displayed the payroll report. Today, 10/28, we will use the bWriter and fileWriter to write the payroll report to a .csv file
//                System.out.printf("Employee ID: %s\nEmployee Name: %s\nEmployee Gross Pay: $%.2f\n\n", employee.getEmployeeId(), employee.getName(), employee.getGrossPay());
                String eWriterLine = String.format(
                        "%s|%s|%.2f\n",
                        employeeId,
                        employeeName,
                        employee.getGrossPay()
                );
                eWriter.write(eWriterLine);
            }
            eWriter.close();
            eReader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Something went wrong while trying to read the employees.csv file");
        }

    }

}