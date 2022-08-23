package home_work_5.creatCollection;

import home_work_5.generation.GenerationPersonAndAnimal;

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
        for (int i = 0; i < 100_000; i++) {
            GenerationPersonAndAnimal generationPersonAndAnimal = new GenerationPersonAndAnimal();
            list.add((T) generationPersonAndAnimal.getPerson());
        }
        long stop = currentTimeMillis();
        System.out.println("HashSet заполнен Person за " + (stop - start) + " мс");
        return list;
    }
    /**
     * Заполняем HashSet Animal и считаем время заполнения
     *
     * @return заполненный HashSet
     */
    public Set<T> addAnimal() {
        long start = currentTimeMillis();
        Set<T> list = new HashSet<>();
        for (int i = 0; i < 100_000; i++) {
            GenerationPersonAndAnimal generationPersonAndAnimal = new GenerationPersonAndAnimal();
            list.add((T) generationPersonAndAnimal.getAnimal());
        }
        long stop = currentTimeMillis();
        System.out.println("HashSet заполнен Animal за " + (stop - start) + " мс");
        return list;
    }
}
