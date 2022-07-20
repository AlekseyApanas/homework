package home_work_2.loops;

import java.util.Scanner;

public class FirstTask1_2 {
    public static void main(String[] args) {
        System.out.println("Enter integer");
        Scanner scanner = new Scanner(System.in);
        int numberUser=0;
        do{
            while (!scanner.hasNextInt()){
                if(scanner.hasNextDouble()){
            System.out.println("Entered not an integer");
                }else {
                    System.out.println("Entered not a number");
                }
            scanner.nextLine();
            }
            numberUser = scanner.nextInt();
        }while (numberUser<=0);
        String[] numberArray = new String[numberUser];
        System.out.println(cycle(String.valueOf(numberUser)));
    }

    /**С помощью цикла перемножили числа введенный пользователем по примеру:
    Ввели 12345, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ*/
    static String cycle(String numberArray) {
        String message;
        int result = 1;
        for (int i = 0; i < numberArray.length(); i++) {
            if (i < numberArray.length() - 1) {
                message = numberArray.charAt(i) + "*";
                System.out.print(message);
            } else {
                message = numberArray.charAt(i) + "=";
                System.out.print(message);
            }
        }
        for (int j = 0; j < numberArray.length(); j++) {
            result = result * Character.getNumericValue(numberArray.charAt(j));
        }
        return String.valueOf(result);
    }
}
