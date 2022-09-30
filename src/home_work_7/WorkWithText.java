package home_work_7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WorkWithText {
    /**
     * Сортирует и возвращает коллекцию с count строк
     *
     * @param mapBook принемает коллекцию Map
     * @param count   количество отсортированных строк
     * @return отсортированную коллекцию с числом count строк
     */
    public static List<Map.Entry<String, Integer>> getTopN(Map<String, Integer> mapBook, int count) {
        List<Map.Entry<String, Integer>> listTopN = new ArrayList<>(mapBook.entrySet());
        listTopN.sort(new ComparatorMap());
        List<Map.Entry<String, Integer>> listCountTopN = new ArrayList<>();
        for (Map.Entry<String, Integer> stringStringEntry : listTopN) {
            if (listCountTopN.size() == count) {
                break;
            } else {
                listCountTopN.add(stringStringEntry);
            }
        }
        return listCountTopN;
    }

    /**
     * Возвращает коллекцию Map с количеством повторений слов в тексте
     *
     * @param mapBook  принимает коллекцию Map
     * @param setBook  принимает коллекцию Set с ключами
     * @param listBook принимает колекцию List с количеством слов в тексте
     */
    public static void getMapBook(Map<String, Integer> mapBook, Set<String> setBook, List<String> listBook) {
        for (String set : setBook) {
            int i = 0;
            for (String list : listBook) {
                mapBook.put(set, i);
                if ((set.equals(list))) {
                    i++;
                    mapBook.put(set, i);
                }
            }
        }
    }

    /**
     * Разделяем текст на отдельные слова
     *
     * @param stringBuilder строку для разделения
     * @return массив строк
     */
    public static String[] getArrayCleanString(StringBuilder stringBuilder) {
        return stringBuilder.toString().split(" ");
    }

    /**
     * Удаляет все символы ,кроме цифр и букв
     *
     * @param book принимает строку
     * @return отсортированную строку
     */

    public static StringBuilder getCleanString(String book) {
        String firstHyphen = " -";
        String secondHyphen = "- ";
        book=book.replaceAll(firstHyphen, " ");
        book=book.replaceAll(secondHyphen, " ");
        book = book.replaceAll("[^A-Za-zА-Яа-я\\d\\s{1}-]", " ").replaceAll("\\s+", " ").trim();
        return new StringBuilder(book);
    }

    /**
     * Переносит файл в строку
     *
     * @param string название файла
     * @return строку
     */
    public static String getString(String string) {
        String book;
        try {
            book = Files.readString(Path.of(string));
        } catch (IOException e) {
            System.out.println("Файл не найден");
            throw new RuntimeException(e);
        }
        return book;
    }
}
