package home_work_7;

public interface ISearchEngine {
    /**
     * Метод считает кол-во повторений слова в тексте
     *
     * @param text текст в котором осуществляется поиск
     * @param word слово для поиска
     * @return кол-во повторений
     */
    long search(String text, String word);
}

