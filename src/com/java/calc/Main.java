package com.java.calc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Operation operation = new Operation();
        Scanner scanner = new Scanner(System.in);
        float result;

        System.out.println("Namaskar");
        System.out.println("Bhartiye Calculator pe aapka swagat hai");
        System.out.println("Kripya apna naam darj karein");
        String name = scanner.nextLine();
        System.out.println("Jama karne ke liye 1 dabayen");
        System.out.println("Ghatane ke liye 2 dabayen");
        System.out.println("Guna karne ke liye 3 dabayen");
        System.out.println("Bhag karne ke liye 4 dabayen");
        int operationNumber = scanner.nextInt();
        System.out.println("Kripya pehla ank darj karien");
        int number1 = scanner.nextInt();
        System.out.println("Kripya doosra ank darj karien");
        int number2 = scanner.nextInt();

        switch(operationNumber) {
            case 1:
                result = operation.getSum(number1, number2);
                System.out.println("Uttar = " + result);
                break;
            case 2:
                result = operation.getDifference(number1, number2);
                System.out.println("Uttar = " + result);
                break;
            case 3:
                result = operation.getProduct(number1, number2);
                System.out.println("Uttar = " + result);
                break;
            case 4:
                result = operation.getProduct(number1, number2);
                System.out.println("Uttar = " + result);
                break;
            default:
                System.out.println("kripya dhang se ink darj karien pantiyan na karein");
                System.out.println("naam "+name+" hai to kuch bhi karoge?");
        }

    }
}
