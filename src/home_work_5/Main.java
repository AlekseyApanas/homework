package home_work_5;

import home_work_5.сreatCollection.CreateArrayList;
import home_work_5.сreatCollection.CreateHashSet;
import home_work_5.сreatCollection.CreateLinkedList;
import home_work_5.сreatCollection.CreateTreeSet;
import home_work_5.comporator.ComparatorAgeAnimal;
import home_work_5.comporator.ComparatorNickAnimal;
import home_work_5.comporator.ComparatorNickPerson;
import home_work_5.comporator.ComparatorPasswordLength;

import java.io.IOException;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        IteratorTime iteratorTime = new IteratorTime();
        SortCollectionSet<Person> sortCollectionPerson = new SortCollectionSet<>();
        SortCollectionSet<Person> sortCollectionAnimal = new SortCollectionSet<>();
        /*  Для Person*/
        CreateArrayList<Person> createPersonArrayList = new CreateArrayList<>();
        List<Person> addPersonArrayList = createPersonArrayList.addPerson();

        CreateLinkedList<Person> createPersonLinkedList = new CreateLinkedList<>();
        List<Person> addPersonLinkedList = createPersonLinkedList.addPerson();

        CreateHashSet<Person> createPersonHashSet = new CreateHashSet<>();
        Set<Person> addPersonHashSet = createPersonHashSet.addPerson();

        CreateTreeSet<Person> createPersonTreeSet = new CreateTreeSet<>();
        Set<Person> addPersonTreeSet = createPersonTreeSet.addPerson();

        addPersonArrayList.sort(new ComparatorPasswordLength());
        addPersonLinkedList.sort(new ComparatorPasswordLength());
        sortCollectionPerson.getPersonSortHashSetAndTreeSet(addPersonHashSet);
        sortCollectionPerson.getPersonSortHashSetAndTreeSet(addPersonTreeSet);

        iteratorTime.iteratorTimeList(addPersonArrayList);
        iteratorTime.iteratorTimeList(addPersonLinkedList);
        iteratorTime.iteratorTimeSet(addPersonHashSet);
        iteratorTime.iteratorTimeSet(addPersonTreeSet);

        iteratorTime.TimeListFor(addPersonArrayList);
        iteratorTime.TimeListFor(addPersonLinkedList);
        iteratorTime.TimeSetFor(addPersonHashSet);
        iteratorTime.TimeSetFor(addPersonTreeSet);

        iteratorTime.iteratorDelList(addPersonArrayList);
        iteratorTime.iteratorDelList(addPersonLinkedList);
        iteratorTime.iteratorDelSet(addPersonHashSet);
        iteratorTime.iteratorDelSet(addPersonTreeSet);
        /*  Для Animal*/
        CreateArrayList<Animal> createAnimalArrayList = new CreateArrayList<>();
        List<Animal> addAnimalArrayList = createAnimalArrayList.addAnimal();

        CreateLinkedList<Animal> createAnimalLinkedList = new CreateLinkedList<>();
        List<Animal> addAnimalLinkedList = createAnimalLinkedList.addAnimal();

        CreateHashSet<Animal> createAnimalHashSet = new CreateHashSet<>();
        Set<Animal> addAnimalHashSet = createAnimalHashSet.addAnimal();

        CreateTreeSet<Animal> createAnimalTreeSet = new CreateTreeSet<>();
        Set<Animal> addAnimalTreeSet = createAnimalTreeSet.addAnimal();

        addAnimalArrayList.sort(new ComparatorAgeAnimal());
        addAnimalLinkedList.sort(new ComparatorAgeAnimal());
        sortCollectionAnimal.getAnimalSortHashSetAndTreeSet(addPersonHashSet);
        sortCollectionAnimal.getAnimalSortHashSetAndTreeSet(addPersonTreeSet);

        iteratorTime.iteratorTimeList(addAnimalArrayList);
        iteratorTime.iteratorTimeList(addAnimalLinkedList);
        iteratorTime.iteratorTimeSet(addAnimalHashSet);
        iteratorTime.iteratorTimeSet(addAnimalTreeSet);

        iteratorTime.TimeListFor(addAnimalArrayList);
        iteratorTime.TimeListFor(addAnimalLinkedList);
        iteratorTime.TimeSetFor(addAnimalHashSet);
        iteratorTime.TimeSetFor(addAnimalTreeSet);

        iteratorTime.iteratorDelList(addAnimalArrayList);
        iteratorTime.iteratorDelList(addAnimalLinkedList);
        iteratorTime.iteratorDelSet(addAnimalHashSet);
        iteratorTime.iteratorDelSet(addAnimalTreeSet);
        /* Двойная сортировка*/
        Comparator<Person> comparatorPasswordLengthAndNick = new ComparatorPasswordLength().thenComparing(new ComparatorNickPerson());
        Comparator<Animal> comparatorAgeAndNick = new ComparatorAgeAnimal().thenComparing(new ComparatorNickAnimal());
        /*Моя сортировка*/
        System.out.println(sortCollectionPerson.getMySortPerson(addPersonArrayList));
        System.out.println(sortCollectionPerson.getMySortAnimal(addAnimalArrayList));
    }
}

