package com.test.sunil;

import java.util.Scanner;

public class IfTest {

   public static void main(String[] args){

       Scanner scanner = new Scanner(System.in);
       String name  = scanner.nextLine();

//       int value = Integer.parseInt(name);

//     String name = "Jaff";

       int age = 15;

       if(name.equals("Jazet")){
           System.out.println("Welcome  Jazet");
       }

       if(name.equals("Akansha")){
           System.out.println("Welcome  Akansha");
       }

       if(name.equals("Jaff")){
           System.out.println("Welcome  Jaff");
       }

       System.out.println("AGE of candidate " +age);


   }


}
