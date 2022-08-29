package home_work_5.sort;

import home_work_5.classDTO.Person;
import home_work_5.comporator.ComparatorPasswordLength;

import java.util.*;

public class SortCollectionPerson {
    /**
     * Метод сортирует коллекцию
     *
     * @param collection принемает коллекцию
     */
    public void getPersonSort(Collection<Person> collection) {
        List<Person> collectionList = new ArrayList<>(collection);
        collectionList.sort(new ComparatorPasswordLength());
    }

    /**
     * Метод сортирует коллекцию Person
     *
     * @param collection принемает коллекцию
     */
    public void getMySortPerson(Collection<Person> collection) {
        List<Person> collectionList = new ArrayList<>(collection);
        List<Person> x = new ArrayList<>();
        for (int i = 0; i < collection.size(); i++) {
            for (int j = collection.size() - 1; j > i; j--) {
                if (collectionList.get(i).getPassword().length() > collectionList.get(j).getPassword().length()) {
                    x.add(collectionList.get(j));
                    x.set(x.size() - 1, collectionList.get(i));
                    collectionList.set(j, collectionList.get(i));
                    collectionList.set(i, x.get(x.size() - 1));
                }
            }
        }
    }
}
