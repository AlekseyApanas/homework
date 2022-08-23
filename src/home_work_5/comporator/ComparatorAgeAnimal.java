package home_work_5.comporator;

import home_work_5.Animal;


import java.util.Comparator;

public class ComparatorAgeAnimal implements Comparator<Animal> {
    /**
     * Сравниваем возраст
     * @param animal1 первый объект
     * @param animal2 второй объект
     * @return результат сравнения (0,-1,1)
     */
    @Override
    public int compare(Animal animal1, Animal animal2) {
        return Integer.compare(animal1.getAge(), animal2.getAge());
    }
}
