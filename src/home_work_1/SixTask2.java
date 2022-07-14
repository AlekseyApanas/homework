package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class SixTask2 {
    public static void main(String[] args) {
        System.out.println("Как тебя зовут");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if (Objects.equals(name,"Вася")) {
            System.out.println("Привет");
            System.out.println("Я тебя так долго ждал");
        } else if (Objects.equals(name,"Анастасия")) {
            System.out.println("Я тебя так долго ждал");
        } else {
            System.out.println("Добрый день, а вы кто?");

        }
    }
}
