package home_work_1;

import java.util.Scanner;

public class SixTask3 {
    public static void main(String[] args) {
        System.out.println("Как тебя зовут");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        switch (name) {
            case ("Вася"):
                System.out.println("Привет");
                System.out.println("Я тебя так долго ждал");
                break;
            case ("Анастасия"):
                System.out.println("Я тебя так долго ждал");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
                break;
        }
    }
}

