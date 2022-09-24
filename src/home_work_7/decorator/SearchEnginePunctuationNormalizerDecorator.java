package home_work_6.decorator;

import home_work_6.ISearchEngine;
import home_work_6.WorkWithText;


public class SearchEnginePunctuationNormalizerDecorator implements ISearchEngine {
    private final ISearchEngine searchEngine;

    public SearchEnginePunctuationNormalizerDecorator(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    /**
     * Оставляем только слова в тексте
     *
     * @param text строка в которой удаляем символы
     * @param word слово для поиска
     * @return текс без лишних элементов
     */
    @Override
    public long search(String text, String word) {
        text = String.valueOf(WorkWithText.getCleanString(text));
        return searchEngine.search(text, word);
    }
}

