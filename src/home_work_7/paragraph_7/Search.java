package home_work_6.paragraph_7;

import home_work_6.ISearchEngine;
import home_work_6.WorkWithText;
import home_work_6.search.EasySearch;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Search {
    private final Scanner scanner = new Scanner(System.in);
    private String folderName;
    private String fileName;

    /*homework/src/home_work_7/paragraph_7/book*/

    /**
     * Выполниет работу с user
     */
    public void work() {
        searchFolder();
        boolean proceedSearchFile = true;
        searchFile();
        while (proceedSearchFile) {
            boolean proceedSearchWord = true;
            searchWord();
            while (proceedSearchWord) {
                System.out.println("Искать другое слово?1-Да,2-Нет");
                String searchWordScanner = this.scanner.nextLine();
                if (searchWordScanner.equals("1")) {
                    searchWord();
                } else if(searchWordScanner.equals("2")) {
                    proceedSearchWord = false;
                }
            }
            System.out.println("Искать другой файл?1-Да,2-Нет");
            String searchWordScanner = this.scanner.nextLine();
            if (searchWordScanner.equals("1")) {
                searchFile();
            } else if(searchWordScanner.equals("2")){
                proceedSearchFile = false;
            }
        }
        try {
            String book = Files.readString(Path.of(this.folderName + "/" + "result.txt"));
            System.out.println(book);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Ищет папку
     */

    private void searchFolder() {
        boolean folder = true;
        while (folder) {
            System.out.println("Введите адрес папки");
            this.folderName = this.scanner.nextLine();
            File file = new File(this.folderName);
            if (!file.exists()) {
                System.out.println("Папка не найдена");
            } else {
                folder = false;
               String[]fileString= file.list();
                for (String s : Objects.requireNonNull(fileString)) {
                    System.out.println(s);
                }
            }
        }
    }

    /**
     * Ищет файл
     */
    private void searchFile() {
        boolean searchFile = true;
        while (searchFile) {
            System.out.println("Введите название книги");
            this.fileName = this.scanner.nextLine();
            File file = new File(this.folderName + "/" + this.fileName);
            if (file.exists()) {
                searchFile = false;
            } else {
                System.out.println("Книга не найден");
            }
        }
    }

    /**
     * Ищет слово
     */
    private void searchWord() {
        System.out.println("Введите слово");
        String word = this.scanner.nextLine();
        ISearchEngine easySearch = new EasySearch();
        String cont = String.valueOf(easySearch.search(WorkWithText.getString(this.folderName + "/" + this.fileName), word));
        System.out.println(cont);
        File file = new File(this.folderName + "/" + "result.txt");
        if (file.exists()) {
            try (FileWriter fileWriter = new FileWriter(file, true)) {
                fileWriter.append(this.fileName).append(" - ").append(word).append(" - ").append(cont);
                fileWriter.append(System.lineSeparator());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            try (FileWriter fileWriter = new FileWriter(file, true)) {
                file.createNewFile();
                fileWriter.write(this.fileName + " - " + word + " - " + cont);
                fileWriter.append(System.lineSeparator());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
