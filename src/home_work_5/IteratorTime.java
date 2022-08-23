package home_work_5;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static java.lang.System.currentTimeMillis;


public class IteratorTime {
    /**
     * Метод измеряет скорость итерирования коллекции при помощи Iterator
     *
     * @param collection коллеция для итерирования
     */
    public <T> void iteratorTimeList(List<T> collection) {
        Iterator<T> itr = collection.iterator();
        long start = currentTimeMillis();
        while (itr.hasNext()) {
            itr.next();
        }
        long stop = currentTimeMillis();
        System.out.println("Операция итерирования iteratorTimeList заняла " + (stop - start) + " мс");
    }

    /**
     * Метод измеряет скорость итерирования коллекции при помощи Iterator
     *
     * @param collection коллеция для итерирования
     */
    public <T> void iteratorTimeSet(Set<T> collection) {
        Iterator<T> itr = collection.iterator();
        long start = currentTimeMillis();
        while (itr.hasNext()) {
            itr.next();
        }
        long stop = currentTimeMillis();
        System.out.println("Операция итерирования iteratorTimeSet заняла " + (stop - start) + " мс");
    }

    /**
     * Метод измеряет скорость итерирования коллекции при помощи For
     *
     * @param collection коллеция для итерирования
     */
    public <T> void TimeListFor(List<T> collection) {
        long start = currentTimeMillis();
        for (int i = 0; i < collection.size(); i++) {
            i++;
        }
        long stop = currentTimeMillis();
        System.out.println("Операция итерирования TimeSetFor заняла " + (stop - start) + " мс");
    }

    /**
     * Метод измеряет скорость итерирования коллекции при помощи For
     *
     * @param collection коллеция для итерирования
     */
    public <T> void TimeSetFor(Set<T> collection) {
        long start = currentTimeMillis();
        for (int i = 0; i < collection.size(); i++) {
            i++;
        }
        long stop = currentTimeMillis();
        System.out.println("Операция итерирования TimeSetFor заняла " + (stop - start) + " мс");
    }

    /**
     * метод удаляет элементы коллекци при помощи Iterator
     *
     * @param collection коллекция для сортировки
     */
    public <T> void iteratorDelList(List<T> collection) {
        Iterator<T> itr = collection.iterator();
        long start = currentTimeMillis();
        while (itr.hasNext()) {
            itr.next();
            itr.remove();
        }
        long stop = currentTimeMillis();
        System.out.println("Операция итерирования iteratorDelList заняла " + (stop - start) + " мс");
    }

    /**
     * метод удаляет элементы коллекци при помощи Iterator
     *
     * @param collection коллекция для сортировки
     */
    public <T> void iteratorDelSet(Set<T> collection) {
        Iterator<T> itr = collection.iterator();
        long start = currentTimeMillis();
        while (itr.hasNext()) {
            itr.next();
            itr.remove();
        }
        long stop = currentTimeMillis();
        System.out.println("Операция итерирования iteratorDelSet заняла " + (stop - start) + " мс");
    }
}