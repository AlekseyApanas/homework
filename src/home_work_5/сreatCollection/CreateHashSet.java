package home_work_5.CreatCollection;

import home_work_5.Generation.GenerationPersonAndAnimal;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import static java.lang.System.currentTimeMillis;

public class CreateHashSet<T> {
    /**
     * Заполняем HashSet Person и считаем время заполнения
     *
     * @return заполненный HashSet
     */
    public Set<T> addPerson() throws IOException {
        long start = currentTimeMillis();
        Set<T> list = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            GenerationPersonAndAnimal generationPersonAndAnimal = new GenerationPersonAndAnimal();
            list.add((T) generationPersonAndAnimal.getPerson());
        }
        long stop = currentTimeMillis();
        System.out.println("HashSet заполнен Person за " + (stop - start) + " мс");
        return list;
    }
}
