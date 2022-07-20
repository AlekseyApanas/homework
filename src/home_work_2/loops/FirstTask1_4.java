package home_work_2.loops;

import java.util.Scanner;

public class FirstTask1_4 {
    /**
     * пользоваатель вводит число
     */
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        do {
            while (!scanner.hasNextInt()) {
                if (scanner.hasNextDouble()) {
                    System.out.println("Entered not an integer");
                } else {
                    System.out.println("Entered not a number");
                }
                scanner.nextLine();
            }
            number = scanner.nextInt();
        } while (number == 0);
        method(number);
    }

    /**Умножаем число long a = 1; пока не произойдёт переполнение.
     * В конце в консоль вывести сообщение со значением до переполнения и после переполнения.
     */
    public static int method(int number) {
        long a = 1L;
        long resultDoUp = 1L;
        long resultAfter = 1L;
        if (number > 0) {
            while (resultAfter > 0) {
                resultAfter = a * resultAfter * number;
                resultAfter = resultAfter;
                if (resultAfter < 0) {
                    System.out.println("После переполнения " + resultAfter);
                    while (resultDoUp > resultAfter) {
                        if (a * resultDoUp * number == resultAfter) {
                            System.out.println("До переполнения " + resultDoUp);
                            break;
                        }
                        resultDoUp = a * resultDoUp * number;
                    }
                }
            }
            return 0;
        }else {
            resultAfter=resultAfter*number;
            while (resultAfter<0) {
                resultAfter = a * resultAfter * (number*-1);
                resultAfter = resultAfter;
                if (resultAfter > 0) {
                    System.out.println("После переполнения " + resultAfter);
                    while (resultDoUp < resultAfter) {
                        if (a * resultDoUp * number == resultAfter*-1) {
                            System.out.println("До переполнения " + resultDoUp);
                            break;
                        }
                        resultDoUp = a * resultDoUp * number;
                    }
                }
            }
            return 0;
        }
    }
}

