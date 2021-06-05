package com.test.sunil;


import java.util.Scanner;

public class SwitchTest {


    public static void main(String[] args){

        SwitchTest switchTest = new SwitchTest();
        switchTest.getNumber();

        for(int i=1;i<=100;i++){
            System.out.println(i);
        }


//        int a = 5;
//        int b = 3;
//
//        System.out.println("Value " + a);
//
//        if(a == b){
//            System.out.println("Yes A is equal to B ");
//        }else {
//            System.out.println("Not equal to");
//        }
//
        String name1 = "KOne";
        String name2 = "KOne";

        if(name1.equals(name2)){
            System.out.println("Yes name1 is equal to name2 ");
        }else{
            System.out.println("Not equal to");
        }



    }


      void getNumber(){

          Scanner scanner = new Scanner(System.in);
          int number = scanner.nextInt();

          switch (number) {
              case 3:
              {
                  System.out.println("V");
                  System.out.println("Val");
                  System.out.println("Valu");
                  System.out.println("Valu");
              }
              break;
              case 4:
                  int a = 5 + 6;
                  System.out.println("A "+a);
              break;

              case 10:
                  System.out.println("Value is 10");
                  break;
              case 20:
                  System.out.println("Value is 20");
              case 30:
                  System.out.println("Value is 30");
                  break;
              case 40:
                  System.out.println("Value is 40");
                  break;
              default:
                  System.out.println("I don't know");
          }
     }



}
