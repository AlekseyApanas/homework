package home_work_7.paragraph_8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WorkWithThread implements Runnable {
    private final String fileName;
    private final String folderName;
    private final String word;
    private final String folderNameForSaveResult;

    public WorkWithThread(String fileName, String folderName, String word, String folderNameForSaveResult) {
        this.fileName = fileName;
        this.folderName = folderName;
        this.word = word;
        this.folderNameForSaveResult = folderNameForSaveResult;
    }

    /**
     * Данный метод производит поиск введенного пользователем слова по всем файлам содержащихся в заданной директории
     */
    @Override
    public void run() {
        home_work_7.ISearchEngine easySearch = new home_work_7.search.EasySearch();
        String cont = String.valueOf(easySearch.search(home_work_7.WorkWithText.getString(this.folderName + "/" + this.fileName), this.word));
        System.out.println(this.fileName + " " + cont);
        File file = new File(this.folderNameForSaveResult + "/" + "result.txt");
        if (file.exists()) {
            try (FileWriter fileWriter = new FileWriter(file, true)) {
                fileWriter.append(this.fileName).append(" - ").append(this.word).append(" - ").append(cont);
                fileWriter.append(System.lineSeparator());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            try (FileWriter fileWriter = new FileWriter(file, true)) {
                fileWriter.write(this.fileName + " - " + this.word + " - " + cont);
                fileWriter.append(System.lineSeparator());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
