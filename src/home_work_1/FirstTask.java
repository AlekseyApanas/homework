package home_work_1;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        int numberOne;
        int numberTwo;
        int operatorAnd;
        int operatorOr;
        float numberFloat=42.5F;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        numberOne = scanner.nextInt();
        System.out.println("Enter the second number");
        numberTwo = scanner.nextInt();
        operatorAnd = numberOne & numberTwo;
        //Число 35 и 47 0b100011 & 0b101111=0b100011
        System.out.println(operatorAnd);
        operatorOr = numberOne | numberTwo;
        //0b100011 & 0b101111=0b101111
        System.out.println(operatorOr);
        //bad operand types for binary operator '&' and '|'
    }
}