package com.java.calc;

public class Operation {
    public float getSum(int number1, int number2){
        return number1 + number2;
    }

    public float getDifference(int number1, int number2){
        int greaterNumber = Math.max(number1, number2);
        int smallerNumber = Math.min(number1, number2);
        return greaterNumber - smallerNumber;
    }

    public float getProduct(int number1, int number2){
        return number1 * number2;
    }

    public float getDivision(int number1, int number2){
        return number1/number2;
    }
}
