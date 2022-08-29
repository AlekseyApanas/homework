package home_work_5.test;

import home_work_5.Iterators;
import home_work_5.classDTO.Animal;
import home_work_5.sort.SortCollectionAnimal;

import java.util.Collection;

public class TestAnimal {
    SortCollectionAnimal sortCollectionAnimal = new SortCollectionAnimal();
    Iterators iterators = new Iterators();

    /**
     * Тестируем Animal
     */
    public void animalTest(Collection<Animal> collection) {
        long start1 = System.currentTimeMillis();
        sortCollectionAnimal.getAnimalSort(collection);
        long finish1 = System.currentTimeMillis();
        System.out.println("Операция: sortStandardCollectionAnimal. Заняла " + (finish1 - start1) + " мс");

        long start2 = System.currentTimeMillis();
        sortCollectionAnimal.getMySortAnimal(collection);
        long finish2 = System.currentTimeMillis();
        System.out.println("Операция: sortMyCollectionAnimal. Заняла " + (finish2 - start2) + " мс");

        long start3 = System.currentTimeMillis();
        iterators.iteratorTimeCollection(collection);
        long finish3 = System.currentTimeMillis();
        System.out.println("Операция: iteratorTimeCollection. Заняла " + (finish3 - start3) + " мс");

        long start4 = System.currentTimeMillis();
        iterators.timeCollectionFor(collection);
        long finish4 = System.currentTimeMillis();
        System.out.println("Операция: timeCollectionFor. Заняла " + (finish4 - start4) + " мс");

        long start5 = System.currentTimeMillis();
        iterators.iteratorDelCollection(collection);
        long finish5 = System.currentTimeMillis();
        System.out.println("Операция: iteratorDelCollection Заняла " + (finish5 - start5) + " мс");
    }
}
