package home_work_5.comporator;

import home_work_5.Person;

import java.util.Comparator;

public class ComparatorPasswordLength implements Comparator<Person> {
    /**
     * Сравниваем длину пароля
     *
     * @param person1 первый объект
     * @param person2 второй объект
     * @return результат сравнения (0,-1,1)
     */
    @Override
    public int compare(Person person1, Person person2) {
        return Integer.compare(person1.getPassword().length(), person2.getPassword().length());
    }
}
