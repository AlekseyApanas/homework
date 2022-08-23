package home_work_5;

import java.io.IOException;

public interface GenI {
    /**
     * Генерирует из любого сивмола
     *
     * @return имя, кличку, псевдоним
     */
    StringBuilder allElements();

    /**
     * Генерирует  из руского алфавита
     *
     * @return имя, кличку
     */
    StringBuilder russianLetters();

    /**
     * Генерирует из списка имён
     *
     * @return имя, кличку
     */
    StringBuilder nameReally();

    /**
     * Генерирует строку из файла
     *
     * @return имя, кличку, псевдоним

     */
    StringBuilder fromFile() throws IOException;
}
