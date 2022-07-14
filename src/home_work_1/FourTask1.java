package home_work_1;

import java.util.Scanner;

public class FourTask1 {
    public static void main(String[] args) {
        int number1;
        int number2;
        int result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        number1 = scanner.nextInt();
        System.out.println("Enter the second number");
        number2 = scanner.nextInt();
        for (int i = number1; i <number2; i++) {
            if(i%2!=0){
                result=i;
                System.out.println(result);
            }
        }
    }
}

