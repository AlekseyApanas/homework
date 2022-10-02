package home_work_7.paragraph_8;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NewMainTest {
    @Test
    public void test() {
        SearchParagraph8 searchParagraph8 = new SearchParagraph8();
        List<String> strings = searchParagraph8.searchFolder("homework/test/home_work_7/paragraph_7/bookTest");
        assertEquals(strings,null);
    }
    @Test
    public void test1() {
        SearchParagraph8 searchParagraph8 = new SearchParagraph8();
        List<String> strings = searchParagraph8.searchFolder("homework/test/home_work_7/paragraph_7/bookTest");
        searchParagraph8.searchWord(strings, "homework/test/home_work_7/paragraph_7/bookTest", "Война", "homework/test/home_work_7/paragraph_8");
        assertEquals("Война.txt - война - 13\nИ.txt - и - 0\nМир.txt - мир - 0",
                NewMain.readBook("homework/test/home_work_7/paragraph_8"));
    }

    @Test
    public void test2() {
        SearchParagraph8 searchParagraph8 = new SearchParagraph8();
        List<String> strings = searchParagraph8.searchFolder("homework/test/home_work_7/paragraph_7/bookTest");
        searchParagraph8.searchWord(strings, "homework/test/home_work_7/paragraph_7/bookTest", "и", "homework/test/home_work_7/paragraph_8");
        assertEquals("Война.txt - война - 13\nИ.txt - и - 0\nМир.txt - мир - 0\nВойна.txt - война - 0\nИ.txt - и - 13\nМир.txt - мир - 0",
                NewMain.readBook("homework/test/home_work_7/paragraph_8"));
    }

    @Test
    public void test3() {
        SearchParagraph8 searchParagraph8 = new SearchParagraph8();
        List<String> strings = searchParagraph8.searchFolder("homework/test/home_work_7/paragraph_7/bookTest");
        searchParagraph8.searchWord(strings, "homework/test/home_work_7/paragraph_7/bookTest", "мир", "homework/test/home_work_7/paragraph_8");
        assertEquals("Война.txt - война - 13\nИ.txt - и - 0\nМир.txt - мир - 0\nВойна.txt - война - 0\nИ.txt - и - 13\nМир.txt - мир - 0\nВойна.txt - война - 0\nИ.txt - и - 0\nМир.txt - мир - 13",
                NewMain.readBook("homework/test/home_work_7/paragraph_8"));

    }
}