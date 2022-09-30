package home_work_7.paragraph_8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyThread implements Runnable {
    private final String fileName;
    private final String folderName;
    private final String word;

    public MyThread(String fileName, String folderName, String word) {
        this.fileName = fileName;
        this.folderName = folderName;
        this.word = word;
    }

    /**
     * Данный метод производит поиск введенного пользователем слова по всем файлам содержащихся в заданной директории
     */
    @Override
    public void run() {
        home_work_7.ISearchEngine easySearch = new home_work_7.search.EasySearch();
        String cont = String.valueOf(easySearch.search(home_work_7.WorkWithText.getString(this.folderName + "/" + fileName), word));
        System.out.println(fileName + " " + cont);
        File file = new File("homework/src/home_work_7/paragraph_8" + "/" + "result.txt");
        if (file.exists()) {
            try (FileWriter fileWriter = new FileWriter(file, true)) {
                fileWriter.append(fileName).append(" - ").append(word).append(" - ").append(cont);
                fileWriter.append(System.lineSeparator());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            try (FileWriter fileWriter = new FileWriter(file, true)) {
                file.createNewFile();
                fileWriter.write(fileName + " - " + word + " - " + cont);
                fileWriter.append(System.lineSeparator());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
