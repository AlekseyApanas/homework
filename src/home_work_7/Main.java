package home_work_7;

import home_work_7.decorator.SearchEngineCaseNormalizerDecorator;
import home_work_7.search.EasySearch;
import home_work_7.decorator.IgnoreCaseDecorator;
import home_work_7.search.RegExSearch;
import home_work_7.decorator.SearchEnginePunctuationNormalizerDecorator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
        Задача 2.1
        */
        Set<String> setBook = new HashSet<>(List.of(WorkWithText.getArrayCleanString(WorkWithText.getCleanString(WorkWithText.getString("homework/src/home_work_7/Война и мир_книга.txt")))));
        System.out.println(setBook.size());
        /*
        Задача 2.2
        */
        List<String> listBook = new ArrayList<>(List.of(WorkWithText.getArrayCleanString(WorkWithText.getCleanString(WorkWithText.getString("homework/src/home_work_7/Война и мир_книга.txt")))));
        Map<String, Integer> mapBook = new HashMap<>();
        WorkWithText.getMapBook(mapBook, setBook, listBook);
        System.out.println(WorkWithText.getTopN(mapBook, 3));
        /*
        Задача 4.1
         */
        System.out.println("EasySearch");
        ISearchEngine easySearch = new EasySearch();
        System.out.println(easySearch.search(WorkWithText.getString("homework/src/home_work_7/Война и мир_книга.txt"), "война"));
        System.out.println(easySearch.search(WorkWithText.getString("homework/src/home_work_7/Война и мир_книга.txt"), "и"));
        System.out.println(easySearch.search(WorkWithText.getString("homework/src/home_work_7/Война и мир_книга.txt"), "мир"));
        /*
        Задача 4.2
        */
        System.out.println("RegExSearch");
        ISearchEngine regExSearch = new RegExSearch();
        System.out.println(regExSearch.search(WorkWithText.getString("homework/src/home_work_7/Война и мир_книга.txt"), "война"));
        System.out.println(regExSearch.search(WorkWithText.getString("homework/src/home_work_7/Война и мир_книга.txt"), "и"));
        System.out.println(regExSearch.search(WorkWithText.getString("homework/src/home_work_7/Война и мир_книга.txt"), "мир"));
        /*
        Задача 4.3
         */
        System.out.println("SearchEnginePunctuationNormalizerDecorator");
        ISearchEngine searchEnginePunctuationNormalizer = new SearchEnginePunctuationNormalizerDecorator(easySearch);
        System.out.println(searchEnginePunctuationNormalizer.search(WorkWithText.getString("homework/src/home_work_7/Война и мир_книга.txt"), "война"));
        System.out.println(searchEnginePunctuationNormalizer.search(WorkWithText.getString("homework/src/home_work_7/Война и мир_книга.txt"), "и"));
        System.out.println(searchEnginePunctuationNormalizer.search(WorkWithText.getString("homework/src/home_work_7/Война и мир_книга.txt"), "мир"));
        /*
        Задача 4.4
         */
        System.out.println("IgnoreCaseDecorator");
        ISearchEngine ignoreCase = new IgnoreCaseDecorator(easySearch);
        System.out.println(ignoreCase.search(WorkWithText.getString("homework/src/home_work_7/Война и мир_книга.txt"), "война"));
        System.out.println(ignoreCase.search(WorkWithText.getString("homework/src/home_work_7/Война и мир_книга.txt"), "и"));
        System.out.println(ignoreCase.search(WorkWithText.getString("homework/src/home_work_7/Война и мир_книга.txt"), "мир"));
         /*
        Задача 4.5
         */
        System.out.println("SearchEngineCaseNormalizerDecorator");
        ISearchEngine searchEngineCaseNormalizerDecorator=new SearchEngineCaseNormalizerDecorator(easySearch);
        System.out.println(searchEngineCaseNormalizerDecorator.search(WorkWithText.getString("homework/src/home_work_7/Война и мир_книга.txt"), "война"));
        System.out.println(searchEngineCaseNormalizerDecorator.search(WorkWithText.getString("homework/src/home_work_7/Война и мир_книга.txt"), "и"));
        System.out.println(searchEngineCaseNormalizerDecorator.search(WorkWithText.getString("homework/src/home_work_7/Война и мир_книга.txt"), "мир"));
    }

}
