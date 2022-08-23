package home_work_5.generation;

import java.util.Random;
import java.util.Scanner;

public class RandomAge {
    /**
     * Генерируем рандомный возраст от1 до 15
     * Проверяем Age
     *
     * @return age
     */
    public int getAge(int age) {
        if (age == 0) {
            Random random = new Random();
            age = 1 + random.nextInt(15);
            return age;
        } else if (age < 1 || age > 15) {
            System.out.println("Введите возраст от 1 до 15");
            Scanner scanner = new Scanner(System.in);
            age = scanner.nextInt();
            return age;
        } else {
            return age;
        }
    }
}
