package home_work_5;

import home_work_5.comporator.ComparatorAgeAnimal;
import home_work_5.comporator.ComparatorPasswordLength;

import java.util.*;

public class SortCollectionSet<T> {
    /**
     * Метод сортирует коллекцию HashSet и TreeSet
     *
     * @param collection принемает коллекцию
     * @return отсортированная коллекция
     */
    public Set<T> getPersonSortHashSetAndTreeSet(Set<T> collection) {
        List<T> collectionList = new ArrayList<>(collection);
        collectionList.sort((Comparator<? super T>) new ComparatorPasswordLength());
        return new HashSet<>(collectionList);
    }

    /**
     * Метод сортирует коллекцию HashSet и TreeSet
     *
     * @param collection принемает коллекцию
     * @return отсортированная коллекция
     */
    public Set<T> getAnimalSortHashSetAndTreeSet(Set<T> collection) {
        List<T> collectionList = new ArrayList<>(collection);
        collectionList.sort((Comparator<? super T>) new ComparatorAgeAnimal());
        return new HashSet<>(collectionList);
    }
    /**
     * Метод сортирует коллекцию Person
     *
     * @param collection принемает коллекцию
     * @return отсортированная коллекция
     */
    public List<Person> getMySortPerson(List<Person> collection) {
        List<Person> x = new ArrayList<>();
        for (int i = 0; i < collection.size(); i++) {
            for (int j = collection.size()-1; j > i; j--) {
                if (collection.get(i).getPassword().length() > collection.get(j).getPassword().length()) {
                    x.add(collection.get(j));
                    x.set(x.size()-1,collection.get(i));
                    collection.set(j, collection.get(i));
                    collection.set(i, x.get(x.size()-1));
                }
            }
        }
        return collection;
    }
    /**
     * Метод сортирует коллекцию Person
     *
     * @param collection принемает коллекцию
     * @return отсортированная коллекция
     */
    public List<Animal> getMySortAnimal(List<Animal> collection) {
        List<Animal> x = new ArrayList<>();
        for (int i = 0; i < collection.size(); i++) {
            for (int j = collection.size()-1; j > i; j--) {
                if (collection.get(i).getAge() > collection.get(j).getAge()) {
                    x.add(collection.get(j));
                    x.set(x.size()-1,collection.get(i));
                    collection.set(j, collection.get(i));
                    collection.set(i, x.get(x.size()-1));
                }
            }
        }
        return collection;
    }
}
