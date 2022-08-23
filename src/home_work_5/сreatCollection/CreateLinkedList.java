package home_work_5.CreatCollection;

import home_work_5.Generation.GenerationPersonAndAnimal;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import static java.lang.System.currentTimeMillis;

public class CreateLinkedList<T> {
    /**
     * Заполняем LinkedList Person и считаем время заполнения
     *
     * @return заполненный LinkedList
     */
    public List<T> addPerson() throws IOException {
        long start = currentTimeMillis();
        List<T> list = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            GenerationPersonAndAnimal generationPersonAndAnimal = new GenerationPersonAndAnimal();
            list.add((T) generationPersonAndAnimal.getPerson());
        }
        long stop = currentTimeMillis();
        System.out.println("LinkedList заполнен Person за " + (stop - start) + " мс");
        return list;
    }
}
