package home_work_7.paragraph_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NewMainTest {
    @Test
    public void test1() {
        Search search = new Search();
        search.searchWord("война", "homework/test/home_work_7/paragraph_7/bookTest", "Война.txt", "homework/test/home_work_7/paragraph_7");
        assertEquals("Война.txt - война - 13", NewMain.readBook("homework/test/home_work_7/paragraph_7"));
    }

    @Test
    public void test2() {
        Search search = new Search();
        search.searchWord("и", "homework/test/home_work_7/paragraph_7/bookTest", "И.txt", "homework/test/home_work_7/paragraph_7");
        assertEquals("Война.txt - война - 13\nИ.txt - и - 13", NewMain.readBook("homework/test/home_work_7/paragraph_7"));
    }

    @Test
    public void test3() {
        Search search = new Search();
        search.searchWord("мир", "homework/test/home_work_7/paragraph_7/bookTest", "Мир.txt", "homework/test/home_work_7/paragraph_7");
        assertEquals("Война.txt - война - 13\nИ.txt - и - 13\nМир.txt - мир - 13", NewMain.readBook("homework/test/home_work_7/paragraph_7"));
    }
}