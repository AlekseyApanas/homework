package home_work_7;

import home_work_7.decorator.IgnoreCaseDecorator;
import home_work_7.decorator.SearchEngineCaseNormalizerDecorator;
import home_work_7.decorator.SearchEnginePunctuationNormalizerDecorator;
import home_work_7.search.EasySearch;
import home_work_7.search.RegExSearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ISearchEngineTest {
    @Test
    public void test1() {
        ISearchEngine easySearch = new EasySearch();
        assertEquals(13, easySearch.search("мир, мир!мир,мир!мир;мир!мир мир!.мир мир?мир-мир,мир -мир,миру мир Мир", "мир"));
    }

    @Test
    public void test2() {
        ISearchEngine regExSearch = new RegExSearch();
        assertEquals(6, regExSearch.search("ИИИ и и.и.и.,и-и,и -и, мир", "и"));
    }

    @Test
    public void test3() {
        ISearchEngine ignoreCaseDecorator = new IgnoreCaseDecorator(new EasySearch());
        assertEquals(3, ignoreCaseDecorator.search("Война,ВОЙНА,воЙна!", "война"));
    }

    @Test
    public void test4() {
        ISearchEngine searchEnginePunctuationNormalizerDecorator = new SearchEnginePunctuationNormalizerDecorator(new EasySearch());
        assertEquals(4, searchEnginePunctuationNormalizerDecorator.search("мир мир!.мир мир?", "мир"));
    }

    @Test
    public void test5() {
        ISearchEngine iSearchEngine = new SearchEngineCaseNormalizerDecorator(new EasySearch());
        assertEquals(2, iSearchEngine.search("мир во всём мире", "мир"));
    }

    @Test
    public void test6() {
        ISearchEngine iSearchEngine = new SearchEngineCaseNormalizerDecorator(new SearchEnginePunctuationNormalizerDecorator(new IgnoreCaseDecorator(new EasySearch())));
        assertEquals(4, iSearchEngine.search("Миру.мир!мирмирмир. мИР,мир-мир-мир,мир -Мир", "мир"));
    }


}