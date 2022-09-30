package home_work_7.search;

import home_work_7.ISearchEngine;
import home_work_7.WorkWithText;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {
    /**
     * Возвращает количество повторений word в text с помощью класса Matcher
     *
     * @param text строка в которой осуществляют посик
     * @param word слово для поиска
     * @return количество повторений
     */
    @Override
    public long search(String text, String word) {
        String[] strings = WorkWithText.getArrayCleanString(WorkWithText.getCleanString(text));
        Pattern pattern = Pattern.compile((word));
        long count = 0L;
        for (String string : strings) {
            Matcher matcher = pattern.matcher(string);
            while (matcher.matches()) {
                count++;
                break;
            }
        }
        return count;
    }
}
