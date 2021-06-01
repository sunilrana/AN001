package com.test.javatest;

public class ClassA extends Employee {

    int salary;


    public static void main(String[] args){

        ClassA classAObject = new ClassA();
        classAObject.salary = 10000;
        classAObject.employeeId = 1;
        classAObject.employeeName = "Akansha";


        ClassA classObject2 = new ClassA();
        classObject2.salary = 20000;
        classObject2.employeeId = 2;
        classObject2.employeeName = "Jazet";


        classAObject.viewEmployeeDetails();
        classObject2.viewEmployeeDetails();

        System.out.println(" Other Details "+ classAObject.salary);
        System.out.println(" Other Details 2 "+ classObject2.salary);

    }

}
