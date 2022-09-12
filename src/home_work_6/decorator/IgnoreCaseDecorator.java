package home_work_6.decorator;


import home_work_6.ISearchEngine;
import home_work_6.WorkWithText;
import home_work_6.search.EasySearch;

public class IgnoreCaseDecorator implements ISearchEngine {
    private ISearchEngine searchEngine;

    public IgnoreCaseDecorator(ISearchEngine searchEngine) {
        if (searchEngine instanceof EasySearch) {
            this.searchEngine = searchEngine;
        }
    }

    /**
     * Пиводит всё к нижнему регистру
     *
     * @param text строка которую приводим к регистру
     * @param word слово для поиска
     * @return текс с нижним регистром
     */
    @Override
    public long search(String text, String word) {
        text = String.valueOf(WorkWithText.getCleanString(text)).toLowerCase();
        try {
            return searchEngine.search(text, word);
        } catch (Exception e) {
            System.out.println("Ошибка");
        }
        return 0;
    }
}

