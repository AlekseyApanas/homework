package home_work_5.generation;

import home_work_5.GenI;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GenerationNickAnimal extends GenerationName implements GenI {

    /**
     * Генерирует name из любого сивмола
     *
     * @return nick
     */
    @Override
    public StringBuilder allElements() {
        return super.allElements();
    }

    /**
     * Генерирует name из руского алфавита
     *
     * @return nick
     */
    @Override
    public StringBuilder russianLetters() {
        return super.russianLetters();
    }

    /**
     * Генерирует nick из списка кличек
     *
     * @return nick
     */
    @Override
    public StringBuilder nameReally() {
        List<StringBuilder> listName = new ArrayList<>();
        listName.add(new StringBuilder("Фунтик"));
        listName.add(new StringBuilder("Гуччи"));
        listName.add(new StringBuilder("Шарик"));
        listName.add(new StringBuilder("Тузик"));
        listName.add(new StringBuilder("Хвостик"));
        listName.add(new StringBuilder("Тарзан"));
        listName.add(new StringBuilder("Арчи"));
        listName.add(new StringBuilder("Барни"));
        listName.add(new StringBuilder("Рэди"));
        listName.add(new StringBuilder("Мажор"));
        return listName.get(getRandomRussianRealName());
    }

    /**
     * Генерирует name из файла NickAnimal
     *
     * @return кличку
     */
    public StringBuilder fromFile() throws IOException {
        File file = new File("NickAnimal.txt");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("Фунтик\nГуччи\nШарик\nТузик\nХвостик\nТарзан\nАрчи\nБарни\nРэди\nМажор");
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
}