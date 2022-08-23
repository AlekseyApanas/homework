package home_work_5.generation;

import home_work_5.GenI;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerationName implements GenI {


    /**
     * Генерирует name из любого сивмола
     *
     * @return name
     */
    @Override
    public StringBuilder allElements() {
        StringBuilder stringBuilderNickAll = new StringBuilder();
        for (int i = 0; i < getLengthString(); i++) {
            stringBuilderNickAll.append((char) getRandomAllNumbers());
        }
        return stringBuilderNickAll;
    }

    /**
     * Генерирует name из руского алфавита
     *
     * @return name
     */
    @Override
    public StringBuilder russianLetters() {
        StringBuilder stringBuilderNickRussian = new StringBuilder();
        for (int i = 0; i < getLengthString(); i++) {
            stringBuilderNickRussian.append((char) getRandomRussianLettersNumber());
        }
        return stringBuilderNickRussian;
    }

    /**
     * Генерирует name из списка имён
     *
     * @return name
     */
    @Override
    public StringBuilder nameReally() {
        List<StringBuilder> listName = new ArrayList<>();
        listName.add(new StringBuilder("Иван"));
        listName.add(new StringBuilder("Алексей"));
        listName.add(new StringBuilder("Никита"));
        listName.add(new StringBuilder("Стас"));
        listName.add(new StringBuilder("Гена"));
        listName.add(new StringBuilder("Петя"));
        listName.add(new StringBuilder("Вася"));
        listName.add(new StringBuilder("Егор"));
        listName.add(new StringBuilder("Игорь"));
        listName.add(new StringBuilder("Паша"));
        return listName.get(getRandomRussianRealName());
    }

    /**
     * Генерирует name из файла Name
     *
     * @return имя
     */
    @Override
    public StringBuilder fromFile() throws IOException {
        File file = new File("Name.txt");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("Иван\nАлексей\nНикита\nСтас\nГена\nПетя\nВася\nЕгор\nИгорь\nПаша");
        fileWriter.flush();
        fileWriter.close();
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String[] strings = new String[10];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = bufferedReader.readLine();
        }
        String name = strings[getRandomRussianRealName()];
        return new StringBuilder(name);
    }

    /**
     * Генерирует рандомное число для сивмола
     *
     * @return число
     */
    private int getRandomAllNumbers() {
        Random random = new Random();
        return random.nextInt();
    }

    /**
     * Генерирует рандомное число из русского алфавита для сивмола
     *
     * @return число
     */
    private int getRandomRussianLettersNumber() {
        Random random = new Random();
        return 1072 + random.nextInt(33);
    }

    /**
     * Генерирует рандомное число из списка
     *
     * @return число
     */
    public int getRandomRussianRealName() {
        Random random = new Random();
        return random.nextInt(10);
    }

    /**
     * Генерирует рандомное число для длинный строки
     *
     * @return длина строки
     */

    public int getLengthString() {
        Random random = new Random();
        return 1 + random.nextInt(10);
    }
}
