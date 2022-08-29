package home_work_5;

import java.util.Collection;
import java.util.Iterator;

public class Iterators {
    /**
     * Метод измеряет скорость итерирования коллекции при помощи Iterator
     *
     * @param collection коллеция для итерирования
     */
    public <T> void iteratorTimeCollection(Collection<T> collection) {
        Iterator<T> itr = collection.iterator();
        while (itr.hasNext()) {
            itr.next();
        }
    }

    /**
     * Метод измеряет скорость итерирования коллекции при помощи For
     *
     * @param collection коллеция для итерирования
     */
    public <T> void timeCollectionFor(Collection<T> collection) {
        for (int i = 0; i < collection.size(); ) {
            i++;
        }
    }

    /**
     * метод удаляет элементы коллекци при помощи Iterator
     *
     * @param collection коллекция для сортировки
     */
    public <T> void iteratorDelCollection(Collection<T> collection) {
        Iterator<T> itr = collection.iterator();
        while (itr.hasNext()) {
            itr.next();
            itr.remove();
        }
    }
}