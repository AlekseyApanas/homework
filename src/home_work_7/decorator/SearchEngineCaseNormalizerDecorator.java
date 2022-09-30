package home_work_7.decorator;

import home_work_7.ISearchEngine;
import home_work_7.WorkWithText;

public class SearchEngineCaseNormalizerDecorator implements ISearchEngine {
    private final ISearchEngine searchEngine;

    public SearchEngineCaseNormalizerDecorator(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    /**
     * Меняем падеж слова в тексте
     *
     * @param text строка в которой удаляем символы
     * @param word слово для поиска
     * @return текс с изменённым падежом
     */
    @Override
    public long search(String text, String word) {
        text = String.valueOf(WorkWithText.getCleanString(text));
        String replaceText = "";
        int count = 0;
        if (word.length() > 2) {
            String wordWithText = word.substring(0, word.length() - 2);
            String[] textArray = WorkWithText.getArrayCleanString(new StringBuilder(text));
            for (String s : textArray) {
                if (s.length() > 2) {
                    for (int i = 0; i < wordWithText.length(); i++) {
                        if (s.charAt(i) == wordWithText.charAt(i)) {
                            count++;
                        }
                    }
                    if (count == wordWithText.length() && s.length() < wordWithText.length() + 4) {
                        s = word;
                    }
                    count = 0;
                }
                replaceText = replaceText.concat(s) + " ";
            }
            return searchEngine.search(replaceText, word);
        }
        return searchEngine.search(text, word);
    }
}
