package home_work_7.paragraph_7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/*homework/src/home_work_7/paragraph_7/book*/
public class NewMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String folderNameForSaveResult = "homework/src/home_work_7/paragraph_7";
        String folderName;
        String fileName;
        String word;
        Search search = new Search();
        do {
            System.out.println("Введите адрес папки");
            folderName = scanner.nextLine();
        } while (search.searchFolder(folderName));
        do {
            System.out.println("Введите название книги");
            fileName = scanner.nextLine();
        } while (search.searchFile(folderName, fileName));
        boolean proceedSearchFile = true;
        while (proceedSearchFile) {
            boolean proceedSearchWord = true;
            System.out.println("Введите слово");
            word = scanner.nextLine();
            search.searchWord(word, folderName, fileName, folderNameForSaveResult);
            while (proceedSearchWord) {
                System.out.println("Искать другое слово?1-Да,2-Нет");
                String searchWordScanner = scanner.nextLine();
                if (searchWordScanner.equals("1")) {
                    System.out.println("Введите слово");
                    word = scanner.nextLine();
                    search.searchWord(word, folderName, fileName, folderNameForSaveResult);
                } else if (searchWordScanner.equals("2")) {
                    proceedSearchWord = false;
                }
            }
            System.out.println("Искать другой файл?1-Да,2-Нет");
            String searchWordScanner = scanner.nextLine();
            if (searchWordScanner.equals("1")) {
                do {
                    System.out.println("Введите название книги");
                    fileName = scanner.nextLine();
                } while (search.searchFile(folderName, fileName));
            } else if (searchWordScanner.equals("2")) {
                proceedSearchFile = false;
            }
        }
        System.out.println(NewMain.readBook(folderNameForSaveResult));
    }

    /**
     * Данный метод читает result.txt
     *
     * @param folderNameForSaveResult путь к папке result.txt
     * @return строку result.txt
     */
    static String readBook(String folderNameForSaveResult) {
        String book;
        try {
            book = Files.readString(Path.of(folderNameForSaveResult + "/" + "result.txt"));
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
        return book;
    }
}

