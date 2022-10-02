package home_work_7.paragraph_8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class NewMain {
    /*homework/src/home_work_7/paragraph_7/book*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String folderNameForSaveResult = "homework/src/home_work_7/paragraph_8";
        String folderName;
        String word;
        List<String> list;
        SearchParagraph8 searchParagraph8 = new SearchParagraph8();
        boolean proceedSearchWord = true;
        do {
            System.out.println("Введите адрес папки");
            folderName = scanner.nextLine();
            list = searchParagraph8.searchFolder(folderName);
        } while (list == null);
        System.out.println("Введите слово");
        word = scanner.nextLine();
        searchParagraph8.searchWord(list, folderName, word, folderNameForSaveResult);
        while (proceedSearchWord) {
            System.out.println("Искать другое слово?1-Да,2-Нет");
            String searchWordScanner = scanner.nextLine();
            if (searchWordScanner.equals("1")) {
                System.out.println("Введите слово");
                word = scanner.nextLine();
                searchParagraph8.searchWord(list, folderName, word, folderNameForSaveResult);
            } else if (searchWordScanner.equals("2")) {
                proceedSearchWord = false;
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
