package com.anywhereapps.javatest;

public class Employee {


    int employeeId;
    String employeeName;

    String section;

    static String manager;



    public void viewEmployeeDetails(){
        System.out.println("Employee Info shared " + employeeId + " " + employeeName);
    }


    public static void main(String[] args){

        Employee employee1 = new Employee();
        employee1.employeeName = "Jazet";
        employee1.employeeId = 1;

        Employee employee2 = new Employee();
        employee2.employeeName = "Ronald";
        employee2.employeeId = 2;

        Employee employee3 = new Employee();
        employee3.employeeId = 3;
        employee3.employeeName = "Jaff";

        employee1.viewEmployeeDetails();
        employee2.viewEmployeeDetails();
        employee3.viewEmployeeDetails();

    }


}