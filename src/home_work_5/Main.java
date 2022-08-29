package home_work_5;

import home_work_5.classDTO.Animal;
import home_work_5.classDTO.Person;
import home_work_5.comporator.ComparatorAgeAnimal;
import home_work_5.comporator.ComparatorNickAnimal;
import home_work_5.comporator.ComparatorNickPerson;
import home_work_5.comporator.ComparatorPasswordLength;
import home_work_5.creatCollection.CreateCollectionAnimal;
import home_work_5.creatCollection.CreateCollectionPerson;
import home_work_5.sort.SortCollectionPerson;
import home_work_5.test.TestAnimal;
import home_work_5.test.TestPerson;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        CreateCollectionPerson createCollectionPerson = new CreateCollectionPerson();
        CreateCollectionAnimal createCollectionAnimal = new CreateCollectionAnimal();
        TestPerson testPerson = new TestPerson();
        TestAnimal testAnimal = new TestAnimal();

        List<Person> personArrayList = new ArrayList<>();
        long start1 = System.currentTimeMillis();
        createCollectionPerson.addPerson(personArrayList);
        long finish1 = System.currentTimeMillis();
        System.out.println(personArrayList.size());
        System.out.println("Операция: createCollectionPersonArrayList. Заняла " + (finish1 - start1) + " мс");

        testPerson.personTest(personArrayList);

        List<Person> personLinkedList = new LinkedList<>();
        long start2 = System.currentTimeMillis();
        createCollectionPerson.addPerson(personLinkedList);
        long finish2 = System.currentTimeMillis();
        System.out.println(personLinkedList.size());
        System.out.println("Операция: createCollectionPersonLinkerList. Заняла " + (finish2 - start2) + " мс");

        testPerson.personTest(personLinkedList);

        Set<Person> personHashSet = new HashSet<>();
        long start3 = System.currentTimeMillis();
        createCollectionPerson.addPerson(personHashSet);
        long finish3 = System.currentTimeMillis();
        System.out.println(personHashSet.size());
        System.out.println("Операция: createCollectionPersonHashSet. Заняла " + (finish3 - start3) + " мс");

        testPerson.personTest(personHashSet);

        Set<Person> personTreeSet = new TreeSet<>(new ComparatorPasswordLength());
        long start4 = System.currentTimeMillis();
        createCollectionPerson.addPerson(personTreeSet);
        long finish4 = System.currentTimeMillis();
        System.out.println(personTreeSet.size());
        System.out.println("Операция: createCollectionPersonTreeSet. Заняла " + (finish4 - start4) + " мс");

        testPerson.personTest(personTreeSet);

        List<Animal> animalArrayList = new ArrayList<>();
        long start5 = System.currentTimeMillis();
        createCollectionAnimal.addAnimal(animalArrayList);
        long finish5 = System.currentTimeMillis();
        System.out.println(animalArrayList.size());
        System.out.println("Операция: createCollectionAnimalArrayList. Заняла " + (finish5 - start5) + " мс");

        testAnimal.animalTest(animalArrayList);

        List<Animal> animalLinkedList = new LinkedList<>();
        long start6 = System.currentTimeMillis();
        createCollectionAnimal.addAnimal(animalLinkedList);
        long finish6 = System.currentTimeMillis();
        System.out.println(animalLinkedList.size());
        System.out.println("Операция: createCollectionAnimalLinkedList. Заняла " + (finish6 - start6) + " мс");

        testAnimal.animalTest(animalLinkedList);

        Set<Animal> animalHashSet = new HashSet<>();
        long start7 = System.currentTimeMillis();
        createCollectionAnimal.addAnimal(animalHashSet);
        long finish7 = System.currentTimeMillis();
        System.out.println(animalHashSet.size());
        System.out.println("Операция: createCollectionAnimalHashSet. Заняла " + (finish7 - start7) + " мс");

        testAnimal.animalTest(animalHashSet);

        Set<Animal> animalTreeSet = new TreeSet<>(new ComparatorAgeAnimal());
        long start8 = System.currentTimeMillis();
        createCollectionAnimal.addAnimal(animalTreeSet);
        long finish8 = System.currentTimeMillis();
        System.out.println(animalTreeSet.size());
        System.out.println("Операция: createCollectionAnimalTreeSet. Заняла " + (finish8 - start8) + " мс");

        testAnimal.animalTest(animalTreeSet);
        /* Двойная сортировка*/
        Comparator<Person> comparatorPasswordLengthAndNick = new ComparatorPasswordLength().thenComparing(new ComparatorNickPerson());
        Comparator<Animal> comparatorAgeAndNick = new ComparatorAgeAnimal().thenComparing(new ComparatorNickAnimal());
    }
}
