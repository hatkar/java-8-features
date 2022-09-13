package com.hatmani;

interface Calculator{
    int substract(int a,int b);
}
public class CalculatorImpl {
    public static void main(String[] args) {
        Calculator calculator =(a,b)-> a-b;

       System.out.println( calculator.substract(9,5));
    }
}
