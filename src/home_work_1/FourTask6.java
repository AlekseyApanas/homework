package home_work_1;

import java.util.Scanner;

public class FourTask6 {
    public static void main(String[] args) {
        System.out.println("Enter age");
        Scanner scanner = new Scanner(System.in);
        int numberAge = scanner.nextInt();
        int daysOfAge;
        if (getYears(numberAge)) {
            daysOfAge = 366;
            System.out.println(daysOfAge);
        } else {
            daysOfAge = 365;
            System.out.println(daysOfAge);
        }
    }

    public static boolean getYears(int numberAge) {
        return ((numberAge % 4 == 0) && (numberAge % 100 != 0)) || (numberAge % 400 == 0);

    }
}