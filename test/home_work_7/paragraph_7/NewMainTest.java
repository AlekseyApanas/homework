package home_work_7.paragraph_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class NewMainTest {
    @Test
    public void test1() {
        Search search = new Search();
        search.searchWord("война", "test/home_work_7/paragraph_7/bookTest", "Война.txt", "test/home_work_7/paragraph_7");
        String[] array = NewMain.readBook("test/home_work_7/paragraph_7").split("\n");
        String resultText = array[array.length - 1];
        boolean result = resultText.trim().equals("Война.txt - война - 13");
        assertTrue(result);
    }

    @Test
    public void test2() {
        Search search = new Search();
        search.searchWord("и", "test/home_work_7/paragraph_7/bookTest", "И.txt", "test/home_work_7/paragraph_7");
        String[] array = NewMain.readBook("test/home_work_7/paragraph_7").split("\n");
        String resultText = array[array.length - 1];
        boolean result = resultText.trim().equals("И.txt - и - 13");
        assertTrue(result);
    }

    @Test
    public void test3() {
        Search search = new Search();
        search.searchWord("мир", "test/home_work_7/paragraph_7/bookTest", "Мир.txt", "test/home_work_7/paragraph_7");
        String[] array = NewMain.readBook("test/home_work_7/paragraph_7").split("\n");
        String resultText = array[array.length - 1];
        boolean result = resultText.trim().equals("Мир.txt - мир - 13");
        assertTrue(result);
    }
}