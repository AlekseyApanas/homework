package home_work_7.paragraph_8;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SearchParagraph8 {
    /**
     * Данный метод производит поиск директории
     *
     * @param folderName название директории
     * @return список файлов
     */
    public List<String> searchFolder(String folderName) {
        boolean folder = true;
        List<String> list = null;
        while (folder) {
            File file = new File(folderName);
            if (!file.exists()) {
                System.out.println("Папка не найдена");
                break;
            } else {
                folder = false;
                String[] fileString = file.list();
                list = new ArrayList<>();
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
     *
     * @param list                    список файлов
     * @param folderName              путь к папке с файлами
     * @param word                    слово для поиска
     * @param folderNameForSaveResult папка для сохранения результата
     */
    public void searchWord(List<String> list, String folderName, String word, String folderNameForSaveResult) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        for (String s : list) {
            executorService.submit(new WorkWithThread(s, folderName, word, folderNameForSaveResult));
        }
        executorService.shutdown();
        boolean done = false;
        try {
            while (!done) {
                done = executorService.awaitTermination(1, TimeUnit.MINUTES);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
