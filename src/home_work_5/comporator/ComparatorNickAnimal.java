package home_work_5.comporator;

import home_work_5.Animal;

import java.util.Comparator;

public class ComparatorNickAnimal implements Comparator<Animal> {
    /**
     * Сравниваем клички по алфавиту
     * @param animal1 первый объект
     * @param animal2 второй объект
     * @return результат сравнения (0,-1,1)
     */
    @Override
    public int compare(Animal animal1, Animal animal2) {
        return animal1.getNick().compareTo(animal2.getNick());
    }
}
