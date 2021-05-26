package com.anywhereapps.javatest;

public class MathsCalculation {

     int varibleA = 30;
     int variableB = 50;


     int sum(int a, int b){
         int c = a + b;
         return c;
     }

    int subtraction(int a, int b){
        int c = a - b;
        return c;
    }

    int multiplication(int a, int b){
        int c = a * b;
        return c;
    }

    int divide(int a, int b){
        int c = a/b;
        return c;
    }


    public static void main(String[] args){

         MathsCalculation mathsCalculation = new MathsCalculation();

         int sumResult = mathsCalculation.sum(5, 8);
        int subResult = mathsCalculation.subtraction(5, 8);
        int mulResult = mathsCalculation.multiplication(5, 8);
        int divideResult = mathsCalculation.divide(5, 8);

        System.out.println("SUM of two values : "+sumResult);
        System.out.println("SUB of two values : "+subResult);
        System.out.println("MUL of two values : "+mulResult);
        System.out.println("DIV of two values : "+divideResult);
        System.out.println("VARIBLE B :"+ mathsCalculation.variableB);
        System.out.println("VARIBLE A :"+ mathsCalculation.varibleA);

    }

}
