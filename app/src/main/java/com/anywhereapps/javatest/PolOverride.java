package com.anywhereapps.javatest;

public class PolOverride extends Employee{

    int salary;

    public void viewEmployeeDetails(){
        super.viewEmployeeDetails();
        System.out.println("Employee salary :"+ salary);
    }

    public void viewEmployeeDetails(int a, String b){
        System.out.println("Print Values :"+ a + " " +b);
    }

    public void viewEmployeeDetails(int a, String b, String c){
        System.out.println("Print Values :"+ a + " " +b + " "+c);
    }

    public static void main(String[] args){

        PolOverride object1 = new PolOverride();
        object1.salary = 1000;
        object1.employeeName = "ABC";
        object1.employeeId = 3;

        object1.viewEmployeeDetails();
        object1.viewEmployeeDetails(3, "Jazet");
        object1.viewEmployeeDetails(8, "Akansha" , "Jaff");

    }

}
