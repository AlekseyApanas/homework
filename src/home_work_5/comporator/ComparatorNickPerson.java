package home_work_5.comporator;

import home_work_5.classDTO.Person;

import java.util.Comparator;

public class ComparatorNickPerson implements Comparator<Person> {
    /**
     * Сравниваем псевдонимы по алфавиту
     * @param person1 первый объект
     * @param person2 второй объект
     * @return результат сравнения (0,-1,1)
     */
    @Override
    public int compare(Person person1, Person person2) {
        return person1.getNick().compareTo(person2.getNick());
    }
}