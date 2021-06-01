package com.test.javatest;

public class ClassB extends Employee {

    ClassB(){

    }

    ClassB(String name, int id){

        this.employeeId = id;
        this.employeeName = name;
    }

     ClassB(int sal, String name, int id){

        this.salary = sal;
        this.employeeId = id;
        this.employeeName = name;
    }

    int salary;


    public static void main(String[] args){

        ClassB classAObject = new ClassB();
        classAObject.salary = 10000;
        classAObject.employeeId = 1;
        classAObject.employeeName = "Akansha";
        classAObject.manager = "ABC";


        ClassB classObject2 = new ClassB("Jazet", 2);
        classObject2.salary = 20000;

        ClassB classObject3 = new ClassB(30000, "Kone", 4);


        classAObject.viewEmployeeDetails();
        classObject2.viewEmployeeDetails();

        System.out.println(" Other Details "+ classAObject.salary + " manager name  " +classAObject.manager);
        System.out.println(" Other Details 2 "+ classObject2.salary + " manager name  " +classObject2.manager);


        classObject3.viewEmployeeDetails();
        System.out.println("Employee 3 salary :"+ classObject3.salary);

        System.out.println("Manager : "+ Employee.manager);
        Employee.manager = "123";

    }

}
