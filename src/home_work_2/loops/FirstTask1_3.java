package home_work_2.loops;

import java.util.Scanner;

public class FirstTask1_3 {
    public static void main(String[] args) {
       /** Пользователь вводит число и степень
          Возводим число в степень*/
        double result = 1;
        System.out.println("Enter number");
        Scanner scanner = new Scanner(System.in);
        double numberUser = 0D;
        do {
            while (!scanner.hasNextDouble()) {
                if (scanner.hasNextLine()) {
                    System.out.println("Entered not an number");
                }
                scanner.nextLine();
            }
            numberUser = scanner.nextDouble();
        } while (numberUser == 0);
        System.out.println("Enter the degree of the number");
        int numberDegree = 0;
        do {
            if(numberDegree<0){
                System.out.println("Entered a positive number");
            }
            while (!scanner.hasNextInt()) {
                if (scanner.hasNextDouble()) {
                    System.out.println("Entered not an integer");
                } else {
                    System.out.println("Entered not a number");
                }
                scanner.nextLine();
            }
            numberDegree = scanner.nextInt();
        } while (numberDegree <= 0);
        for (int i =0; i <numberDegree; i++) {
            result=  result*numberUser;
            result=result;
        }
        System.out.println(numberUser+" ^ "+numberDegree+" = "+result);
    }
}
