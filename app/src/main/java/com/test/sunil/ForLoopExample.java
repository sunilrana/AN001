package com.test.sunil;

import java.util.Scanner;

public class ForLoopExample {

    public static void main(String[] args){

        ForLoopExample object1 = new ForLoopExample();
        object1.printLoopValues();
    }



    public void printLoopValues(){
        // print n numbers by loop

        Scanner scanner = new Scanner(System.in);
        int inputVaue = scanner.nextInt();

        System.out.println(" Input Values : " + inputVaue);

        for(int i=0; i<=10; i++){
      //     System.out.println(" Result value of :" +inputVaue + " index : " + i);

            System.out.println(inputVaue + " x " + i + " = " + inputVaue * i);


        }


    }
}
