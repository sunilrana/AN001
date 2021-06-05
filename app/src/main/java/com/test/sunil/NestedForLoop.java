package com.test.sunil;

public class NestedForLoop {

    public static void main(String[] args){

        example1();
    }



    static void example1(){
        for(int a=0; a<=10; a++){

            System.out.println("OuterLoop");
            for(int b= 0; b<=10; b++){

                System.out.println("Outerloop Index " + a +" Inner loop index "+ b);
            }

            System.out.println("Complete Inner Loop" +a);
        }
    }


    static void example2(){

        for(int a=0; a<=10; a++){

            System.out.println("OuterLoop index " + a);
            System.out.println("Inner Loop starts ");
            for(int b= 0; b<=10; b++){

                System.out.print(b + " ");
            }
            System.out.println("");
            System.out.println("Inner Loop exit ");
        }
    }


}
