package home_work_4;

import java.util.*;

public class DataContainer<T> implements Iterable<T> {
    private T[] data;

    public DataContainer(T[] data) {
        this.data = data;
    }

    /**
     * Добавляет данные во внутреннее поле data
     *
     * @param item данные ,которые передаёт пользователь
     * @return возвращает номер позиции в которую были вставлены данные, начиная с 0
     */
    public int add(T item) {
        for (int i = 0; i < data.length; ) {
            if (item == null) {
                return -1;
            } else if (data[i] == null) {
                data[i] = item;
                return i;
            } else if (i < data.length && i < data.length - 1) {
                i++;
            } else {
                data = Arrays.copyOf(data, data.length + 1);
                data[data.length - 1] = item;
                return data.length - 1;
            }
        }
        return 0;
    }

    /**
     * Данный метод получает из DataContainer'а, из поля data, предварительно сохранённый объект который мы передали на предыдущем шаге через метод add
     *
     * @param index принимает индекс элемента массива
     * @return возвращает данные ,которые находятся под позицией index
     */
    public T get(int index) {
        for (int i = 0; i < data.length; ) {
            if (i == index) {
                return data[i];
            } else if (i < data.length && i < data.length - 1) {
                i++;
            } else {
                return null;
            }
        }
        return null;
    }

    /**
     * @return возвращает поле
     */
    public T[] getItems() {
        return data;
    }

    /**
     * Удалять элемент из нашего поля data по индексу
     *
     * @param index принимает индекс элемента массива
     * @return возвращает true -если удалил ,false - если не удалил
     */
    public boolean delete(int index) {
        for (int i = 0; i < data.length; ) {
            if (i == index && index < data.length - 1) {
                data[i] = data[i + 1];
                index++;
            } else if (i < data.length && i < data.length - 1) {
                i++;
            } else if (data[data.length - 1] == data[data.length - 2]) {
                data = Arrays.copyOf(data, data.length - 1);
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    /**
     * Удалять элемент из нашего поля data
     *
     * @param item принемает значение массива
     * @return возвращает true -если удалил ,false - если не удалил
     */
    public boolean delete(T item) {
        for (int i = 0; i < data.length; i++) {
            if (Objects.equals(data[i], item)) {
                delete(i);
                return true;
            }
        }
        return false;
    }

    /**
     * Сортируем массив с помощью comparator
     *
     * @param comparator переданный аргумент объекта класса ComparatorContainerString
     */
    public void sort(Comparator<T> comparator) {
        for (int i = 0; i < data.length; i++) {
            for (int j = data.length - 1; j > i; j--) {
                if (data[i] != null && data[j] != null) {
                    if (comparator.compare(data[i], data[j]) > 0) {
                        T x = data[j];
                        data[j] = data[i];
                        data[i] = x;
                    }
                }
            }
        }
    }

    /**
     * Удаляем в массиве null
     *
     * @return возвращаем строку без null
     */
    @Override
    public String
    toString() {
        for (int i = data.length - 1; i > 0; i--) {
            if (data[i] == null) {
                data = Arrays.copyOf(data, data.length - 1);
            }
        }
        return " data= " + Arrays.toString(data);
    }

    /**
     * Сортируем массив с помощью compareTo
     *
     * @param container переданный аргумент объекта класса с дженериком
     * @param <T>       дженерик
     */
    public static <T extends Comparable<T>> void sort(DataContainer<T> container) {
        T[] array = container.getItems();
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[i] != null && array[j] != null) {
                    if (array[i].compareTo((array[j])) > 0) {
                        T x = array[j];
                        array[j] = array[i];
                        array[i] = x;
                    }
                }
            }
        }
    }

    /**
     * Сортируем массив с помощью comparator
     *
     * @param container  переданный аргумент объекта класса с дженериком
     * @param comparator переданный аргумент объекта класса ComparatorContainerString
     * @param <T>        дженерик
     */
    public static <T> void sort(DataContainer<T> container, Comparator<T> comparator) {
        T[] array = container.getItems();
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[i] != null && array[j] != null) {
                    if (comparator.compare(array[i], array[j]) > 0) {
                        T x = array[j];
                        array[j] = array[i];
                        array[i] = x;
                    }
                }
            }
        }
    }

    /**
     * Переопределяем метод итератор
     *
     * @return создаём новый Iterator
     */
    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            private int counter = 0;

            /**
             * Проверяет наличие следующего элемента
             *
             * @return если елемент есть возвращает true, если елемента нет false
             */
            @Override
            public boolean hasNext() {
                return data.length > counter;
            }

            /**
             *Возвращаем элемент и переходим к следующему элементу
             * @return возвращает элемент массива
             */
            @Override
            public T next() {
                return data[counter++];
            }
        };
    }
}
