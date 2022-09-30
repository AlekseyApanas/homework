package home_work_7.paragraph_8;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SearchParagraph8 {
    private final Scanner scanner = new Scanner(System.in);
    private String folderName;

    /*homework/src/home_work_7/paragraph_7/book*/

    /**
     * Данный метод выполниет работу с user
     */
    public void work() {
        boolean proceedSearchWord = true;
        List<String> list = searchFolder();
        searchWord(list);
        while (proceedSearchWord) {
            System.out.println("Искать другое слово?1-Да,2-Нет");
            String searchWordScanner = this.scanner.nextLine();
            if (searchWordScanner.equals("1")) {
                searchWord(list);
            } else if (searchWordScanner.equals("2")) {
                proceedSearchWord = false;
            }
        }
        try {
            String book = Files.readString(Path.of("homework/src/home_work_7/paragraph_8" + "/" + "result.txt"));
            System.out.println(book);
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Данный метод производит поиск директории
     */

    private List<String> searchFolder() {
        boolean folder = true;
        List<String> list = new ArrayList<>();
        while (folder) {
            System.out.println("Введите адрес папки");
            this.folderName = this.scanner.nextLine();
            File file = new File(this.folderName);
            if (!file.exists()) {
                System.out.println("Папка не найдена");
            } else {
                folder = false;
                String[] fileString = file.list();
                for (String s : Objects.requireNonNull(fileString)) {
                    System.out.println(s);
                    list.add(s);
                }
            }
        }
        return list;
    }

    /**
     * Данный метод создаёт поток
     */
    private void searchWord(List<String> list) {
        System.out.println("Введите слово");
        String word = this.scanner.nextLine();
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        for (String s : list) {
            executorService.submit(new MyThread(s, folderName, word));
        }
        executorService.shutdown();
    }
}