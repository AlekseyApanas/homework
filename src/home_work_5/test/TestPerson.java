package home_work_5.test;

import home_work_5.Iterators;
import home_work_5.classDTO.Person;
import home_work_5.sort.SortCollectionPerson;


import java.util.Collection;


public class TestPerson {
    SortCollectionPerson sortCollectionPerson = new SortCollectionPerson();
    Iterators iteratorCollection = new Iterators();

    /**
     * Тестируем Person
     */
    public void personTest(Collection<Person> collection) {
        long start1 = System.currentTimeMillis();
        sortCollectionPerson.getPersonSort(collection);
        long finish1 = System.currentTimeMillis();
        System.out.println("Операция: sortStandardCollectionPerson. Заняла " + (finish1 - start1) + " мс");

        long start2 = System.currentTimeMillis();
        sortCollectionPerson.getMySortPerson(collection);
        long finish2 = System.currentTimeMillis();
        System.out.println("Операция: sortMyCollectionPerson. Заняла " + (finish2 - start2) + " мс");

        long start3 = System.currentTimeMillis();
        iteratorCollection.iteratorTimeCollection(collection);
        long finish3 = System.currentTimeMillis();
        System.out.println("Операция: iteratorTimeCollection. Заняла " + (finish3 - start3) + " мс");

        long start4 = System.currentTimeMillis();
        iteratorCollection.timeCollectionFor(collection);
        long finish4 = System.currentTimeMillis();
        System.out.println("Операция: timeCollectionFor. Заняла " + (finish4 - start4) + " мс");

        long start5 = System.currentTimeMillis();
        iteratorCollection.iteratorDelCollection(collection);
        long finish5 = System.currentTimeMillis();
        System.out.println("Операция: iteratorDelCollection. Заняла " + (finish5 - start5) + " мс");
    }
}


