package home_work_7.paragraph_8;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NewMainTest {
    @Test
    public void test1() {
        SearchParagraph8 searchParagraph8 = new SearchParagraph8();
        List<String> strings = searchParagraph8.searchFolder("test/home_work_7/paragraph_7/bookTest");
        searchParagraph8.searchWord(strings, "test/home_work_7/paragraph_7/bookTest", "война", "test/home_work_7/paragraph_8");
        String[] array = NewMain.readBook("test/home_work_7/paragraph_8").split("\n");
        String resultText = array[array.length - 3].trim().concat("\n").concat(array[array.length - 2].trim()).concat("\n").concat(array[array.length - 1]);
        boolean result = resultText.trim().equals("Война.txt - война - 13\nИ.txt - война - 0\nМир.txt - война - 0");
        assertTrue(result);
    }

    @Test
    public void test2() {
        SearchParagraph8 searchParagraph8 = new SearchParagraph8();
        List<String> strings = searchParagraph8.searchFolder("test/home_work_7/paragraph_7/bookTest");
        searchParagraph8.searchWord(strings, "test/home_work_7/paragraph_7/bookTest", "и", "test/home_work_7/paragraph_8");
        String[] array = NewMain.readBook("test/home_work_7/paragraph_8").split("\n");
        String resultText = array[array.length - 3].trim().concat("\n").concat(array[array.length - 2].trim()).concat("\n").concat(array[array.length - 1]);
        boolean result = resultText.trim().equals("Война.txt - и - 0\nИ.txt - и - 13\nМир.txt - и - 0");
        assertTrue(result);
    }

    @Test
    public void test3() {
        SearchParagraph8 searchParagraph8 = new SearchParagraph8();
        List<String> strings = searchParagraph8.searchFolder("test/home_work_7/paragraph_7/bookTest");
        searchParagraph8.searchWord(strings, "test/home_work_7/paragraph_7/bookTest", "мир", "test/home_work_7/paragraph_8");
        String[] array = NewMain.readBook("test/home_work_7/paragraph_8").split("\n");
        String resultText = array[array.length - 3].trim().concat("\n").concat(array[array.length - 2].trim()).concat("\n").concat(array[array.length - 1]);
        boolean result = resultText.trim().equals("Война.txt - мир - 0\nИ.txt - мир - 0\nМир.txt - мир - 13");
        assertTrue(result);
    }
}