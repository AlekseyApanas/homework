package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class SixTask2 {
    public static void main(String[] args) {
        System.out.println("Как тебя зовут");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(getResult(name));
    }

    public static String getResult(String name) {
        String line;
        if (Objects.equals(name, "Вася")) {
            line = "Привет\nЯ тебя так долго ждал";
            return line;
        } else if (Objects.equals(name, "Анастасия")) {
            line = "Я тебя так долго ждал";
            return line;
        } else {
            line = "Добрый день, а вы кто?";
            return line;
        }
    }
}
