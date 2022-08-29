package home_work_5.sort;

import home_work_5.classDTO.Animal;
import home_work_5.comporator.ComparatorAgeAnimal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SortCollectionAnimal {
    /**
     * Метод сортирует коллекцию
     *
     * @param collection принемает коллекцию
     */
    public void getAnimalSort(Collection<Animal> collection) {
        List<Animal> collectionList = new ArrayList<>(collection);
        collectionList.sort(new ComparatorAgeAnimal());
    }

    /**
     * Метод сортирует коллекцию
     *
     * @param collection принемает коллекцию
     */
    public void getMySortAnimal(Collection<Animal> collection) {
        List<Animal> x = new ArrayList<>();
        List<Animal> collectionList = new ArrayList<>(collection);
        for (int i = 0; i < collection.size(); i++) {
            for (int j = collection.size() - 1; j > i; j--) {
                if (collectionList.get(i).getAge() > collectionList.get(j).getAge()) {
                    x.add(collectionList.get(j));
                    x.set(x.size() - 1, collectionList.get(i));
                    collectionList.set(j, collectionList.get(i));
                    collectionList.set(i, x.get(x.size() - 1));
                }
            }
        }
    }
}
