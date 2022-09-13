package classwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class StudentSup implements Supplier<Student> {
    private static final List<String> libraryName = new ArrayList<>(Arrays.asList(
            "Алексей",
            "Илья",
            "Виктор",
            "Дарья",
            "Леонид",
            "Петр",
            "Коля",
            "Вика",
            "Диана",
            "Павел"));

    private static final List<String> libraryLastName = new ArrayList<>(Arrays.asList(
            "Смирнов",
            "Иванов",
            "Кузнецов",
            "Соколов",
            "Попов",
            "Лебедев",
            "Козлов",
            "Новиков",
            "Морозов",
            "Петров_"));


    private static final List<String> libraryMiddleName = new ArrayList<>(Arrays.asList(
            "Казимирович",
            "Валерьевич",
            "Александрович",
            "Владимирович",
            "Вадимович",
            "Сергеевич",
            "Михайлович",
            "Викторович",
            "Егорович",
            "Анатольевич"));

    @Override
    public Student get() {
        Random random = new Random();
        return new Student(createRandomName(libraryName), createRandomName(libraryLastName), createRandomName(libraryMiddleName), random.nextInt(10));
    }

    private static String createRandomName(List<String> library) {
        Random random = new Random();
        return library.get(random.nextInt(10));
    }
}
