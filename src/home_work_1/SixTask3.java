package home_work_1;
import java.util.Scanner;

public class SixTask3 {
    public static void main(String[] args) {
        System.out.println("Как тебя зовут");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(getResult(name));
    }

    public static String getResult(String name) {
        String line;
        switch (name) {
            case ("Вася"):
                line = "Привет\nЯ тебя так долго ждал";
                return line;
            case ("Анастасия"):
                line = "Я тебя так долго ждал";
                return line;
            default:
                line = "Добрый день, а вы кто?";
                return line;
        }
    }
}

