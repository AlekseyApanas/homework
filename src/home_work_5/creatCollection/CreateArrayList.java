package home_work_5.creatCollection;

import home_work_5.generation.GenerationPersonAndAnimal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.currentTimeMillis;

public class CreateArrayList<T> {
    /**
     * Заполняем ArrayList Person и считаем время заполнения
     *
     * @return заполненный ArrayList
     */
    public List<T> addPerson() throws IOException {
        long start = currentTimeMillis();
        List<T> list = new ArrayList<>();
        for (int i = 0; i < 100_000; i++) {
            GenerationPersonAndAnimal generationPersonAndAnimal = new GenerationPersonAndAnimal();
            list.add((T) generationPersonAndAnimal.getPerson());
        }
        long stop = currentTimeMillis();
        System.out.println("ArrayList заполнен Person за " + (stop - start) + " мс");
        return list;
    }

    /**
     * Заполняем ArrayList Animal и считаем время заполнения
     *
     * @return заполненный ArrayList
     */
    public List<T> addAnimal() {
        long start = currentTimeMillis();
        List<T> list = new ArrayList<>();
        for (int i = 0; i < 100_000; i++) {
            GenerationPersonAndAnimal generationPersonAndAnimal = new GenerationPersonAndAnimal();
            list.add((T) generationPersonAndAnimal.getAnimal());
        }
        long stop = currentTimeMillis();
        System.out.println("ArrayList заполнен Animal за " + (stop - start) + " мс");
        return list;
    }
}
