package home_work_4;

import java.util.Comparator;

public class ComparatorContainerString implements Comparator<String> {
    /**
     * @param o1 первый объект для сравнения
     * @param o2 второй объект для сравнения
     * @return результат сравнения ,если o1<o2,то вернум -1 ,если o1>o2,то вернум 1, иначе 0
     */
    @Override
    public int compare(String o1, String o2) {
        return Integer.compare(o1.length(), o2.length());
    }
}
