package com.anywhereapps.javatest;

public class FirstTest {

    public static void main(String[] args) {

       Student student1 = new Student();
       student1.name = "Ronald";
       student1.rollNumber = 1;
       student1.section = "A";

       Student student2 = new Student();
         student2.name = "Akansha";
         student2.rollNumber = 2;
         student2.section = "B";

        Student student3 = new Student();
        student3.name = "Sunil";
        student3.rollNumber = 2;
        student3.section = "A";


        Student student4 = new Student(3, "Jaff", "B");


        System.out.println(" First Student " + student1.name);
        System.out.println(" Second Student " + student2.name);
        System.out.println(" Third Student " + student3.name);


        System.out.println(" Student 1 " + student1.name + " " + student1.rollNumber + " "+ student1.section);
        System.out.println(" Student 2 " + student2.name + " " + student2.rollNumber + " "+ student2.section);
        System.out.println(" Student 3 " + student3.name + " " + student3.rollNumber + " "+ student3.section);
        System.out.println(" Student 4 " + student4.name + " " + student4.rollNumber + " "+ student4.section);

    }


    public void addition(){
        int a = 5;
        int b = 10;

        int c = a + b;
        System.out.println(" result "+c);

    }
}
