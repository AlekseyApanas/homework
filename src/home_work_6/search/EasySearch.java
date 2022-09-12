package home_work_6.search;

import home_work_6.ISearchEngine;
import home_work_6.WorkWithText;

public class EasySearch implements ISearchEngine {
    /**
     * Возвращает количество повторений word в text
     *
     * @param text строка в которой осуществляют посик
     * @param word слово для поиска
     * @return количество повторений
     */
    @Override
    public long search(String text, String word) {
        String[] strings = WorkWithText.getArrayCleanString(WorkWithText.getCleanString(text));
        long count = 0L;
        for (String string : strings) {
            boolean b = string.length() == word.length() && string.indexOf(word) == 0;
            if (b) {
                count++;
            }
        }
        return count;
    }
}