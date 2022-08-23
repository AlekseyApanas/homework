package home_work_5.CreatCollection;

import home_work_5.Generation.GenerationPersonAndAnimal;
import home_work_5.comporator.ComparatorPasswordLength;

import java.io.IOException;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import static java.lang.System.currentTimeMillis;

public class CreateTreeSet<T> {
    /**
     * Заполняем TreeSet Person и считаем время заполнения
     *
     * @return заполненный TreeSet
     */
    public Set<T> addPerson() throws IOException {
        long start = currentTimeMillis();
        Set<T> list = new TreeSet<>((Comparator<? super T>) new ComparatorPasswordLength());
        for (int i = 0; i < 100; i++) {
            GenerationPersonAndAnimal generationPersonAndAnimal = new GenerationPersonAndAnimal();
            list.add((T) generationPersonAndAnimal.getPerson());
        }
        long stop = currentTimeMillis();
        System.out.println("TreeSet заполнен Person за " + (stop - start)+" мс");
        return list;
    }
}
