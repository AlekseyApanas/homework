package home_work_5;

import home_work_5.classDTO.Person;
import home_work_5.comporator.ComparatorPasswordLength;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

public class TestPersonAndAnimal {
    public void personTest(Collection<Person> collection) {
        Iterators personIterators=new Iterators();
        long start1 = System.currentTimeMillis();
        collection.sort(new ComparatorPasswordLength());
        long finish1 = System.currentTimeMillis();
        System.out.println("Операция: sortStandardCollectionPerson. Заняла " + (finish1 - start1) + " мс");

        long start2 = System.currentTimeMillis();
        sortMyCollection(collection, comparator);
        long finish2 = System.currentTimeMillis();
        System.out.println("Операция: sortMyCollectionPerson. Заняла " + (finish2 - start2) + " мс");

        long start3 = System.currentTimeMillis();
        iteratorCollection(collection);
        long finish3 = System.currentTimeMillis();
        System.out.println("Операция: iteratorCollection. Заняла " + (finish3 - start3) + " мс");

        long start4 = System.currentTimeMillis();
        enumerationCollection(collection);
        long finish4 = System.currentTimeMillis();
        System.out.println("Операция: iteratorCollection. Заняла " + (finish4 - start4) + " мс");

        long start5 = System.currentTimeMillis();
        collection.clear();
        long finish5 = System.currentTimeMillis();
        System.out.println("Операция: clear. Заняла " + (finish5 - start5) + " мс");
    }
}
}

