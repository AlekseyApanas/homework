package home_work_7.paragraph_7;

import home_work_7.ISearchEngine;
import home_work_7.WorkWithText;
import home_work_7.search.EasySearch;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Objects;

public class Search {
    /**
     * Данный метод производит поиск директории
     *
     * @param folderName путь к папке с файлами
     * @return true- папка не найдена,false- папка найдена
     */

    public boolean searchFolder(String folderName) {
        boolean folder = true;
        while (folder) {
            File file = new File(folderName);
            if (!file.exists()) {
                System.out.println("Папка не найдена");
                break;
            } else {
                folder = false;
                String[] fileString = file.list();
                for (String s : Objects.requireNonNull(fileString)) {
                    System.out.println(s);
                }
            }
        }
        return folder;
    }

    /**
     * Данный метод производит поиск введенного пользователем файла
     *
     * @param folderName путь к папке с файлами
     * @param fileName   имя файла
     * @return true- файл не найден,false- файл найден
     */
    public boolean searchFile(String folderName, String fileName) {
        boolean searchFile = true;
        while (searchFile) {
            File file = new File(folderName + "/" + fileName);
            if (file.exists()) {
                searchFile = false;
            } else {
                System.out.println("Книга не найден");
                break;
            }
        }
        return searchFile;
    }

    /**
     * Данный метод производит поиск введенного пользователем слова в файле и записывает в новый файл
     *
     * @param word                    слово для поиска
     * @param folderName              путь к папке с файлами
     * @param fileName                имя файла
     * @param folderNameForSaveResult папка для сохранения результата
     */
   public void searchWord(String word, String folderName, String fileName, String folderNameForSaveResult) {
        ISearchEngine easySearch = new EasySearch();
        String cont = String.valueOf(easySearch.search(WorkWithText.getString(folderName + "/" + fileName), word));
        System.out.println(cont);
        File file = new File(folderNameForSaveResult + "/" + "result.txt");
        if (file.exists()) {
            try (FileWriter fileWriter = new FileWriter(file, true)) {
                fileWriter.append(fileName).append(" - ").append(word).append(" - ").append(cont);
                fileWriter.append(System.lineSeparator());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            try (FileWriter fileWriter = new FileWriter(file, true)) {
                fileWriter.write(fileName + " - " + word + " - " + cont);
                fileWriter.append(System.lineSeparator());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
