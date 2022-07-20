package home_work_2.loops;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstTask1_1 {
    public static void main(String[] args) {
        //1.1.1
        System.out.println("Enter number");
        Scanner scanner = new Scanner(System.in);
        int numberUser = scanner.nextInt();
        System.out.println(cycle(numberUser));
        //1.1.2
        System.out.println("Enter number for recursion");
        int numberUserRecursion = scanner.nextInt();
        System.out.print("1");
        System.out.println("=".concat(String.valueOf(factorial(numberUserRecursion))));
    }

    /**
     * С помощью цикла перемножили числа введенный пользователем по примеру:
     * Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ
     */
    static int cycle(int numberUser) {
        String message;
        int result = 1;
        for (int i = 1; i <= numberUser; i++) {
            if (i < numberUser) {
                message = i + "*";
                System.out.print(message);
            } else {
                message = i + "=";
                System.out.print(message);
            }
        }
        for (int j = 1; j < numberUser; j++) {
            result = result * ++j;
            result = result;
            --j;
        }
        return result;
    }

    /**
     * С помощью рекурсии перемножили числа введенный пользователем по примеру:
     * Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ
     */
    static int factorial(int numberUserRecursion) {
        int resultRecursion;
        if (numberUserRecursion < 2) {
            return 1;
        }
        resultRecursion = factorial(numberUserRecursion - 1) * numberUserRecursion;
        if (numberUserRecursion > 1) {
            System.out.print("*"+numberUserRecursion );
        } else {
            System.out.print(numberUserRecursion);
        }

        return resultRecursion;
    }
}


