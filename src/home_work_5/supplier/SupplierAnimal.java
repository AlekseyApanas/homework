package home_work_5.supplier;

import home_work_5.classDTO.Animal;
import home_work_5.generation.GenerationNickAnimal;
import home_work_5.generation.RandomAge;

import java.util.function.Supplier;

public class SupplierAnimal implements Supplier<Animal> {
    RandomAge randomAge = new RandomAge();
    GenerationNickAnimal generationNickAnimal = new GenerationNickAnimal();

    /**
     *
     * @return Возвращаем Animal
     */
    @Override
    public Animal get() {
        {
            return new Animal(randomAge.getAge(0), generationNickAnimal.nameReally());
        }
    }
}
