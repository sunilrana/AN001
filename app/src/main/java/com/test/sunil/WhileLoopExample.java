package com.test.sunil;

public class WhileLoopExample {


    public static void main(String[] args){

       int a = 0;

       while (a<0){
           System.out.println("A value "+ a);
           a++;
       }


   //     doWhileExample();

    }


    static public void doWhileExample(){

        int b = 0;

        do{
          System.out.println(" I am do while loop" +b);
          b++;
        }while (b<0);

    }

}
