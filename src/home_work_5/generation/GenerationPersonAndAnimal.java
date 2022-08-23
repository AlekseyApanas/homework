package home_work_5.generation;

import home_work_5.Animal;
import home_work_5.Person;

import java.io.IOException;

public class GenerationPersonAndAnimal {
    GenerationName generationName = new GenerationName();
    GenerationNickPerson generationNickPerson = new GenerationNickPerson();
    RandomPassword randomPassword = new RandomPassword();
    RandomAge randomAge = new RandomAge();
    GenerationNickAnimal generationNickAnimal = new GenerationNickAnimal();

    /**
     * Метод возвращает Person
     * @return Person
     */
    public Person getPerson() throws IOException {
        return new Person(generationNickPerson.fromFile(), randomPassword.getPassword(null), generationName.nameReally());
    }

    /**
     * Метод возвращает Animal
     * @return Animal
     */
    public Animal getAnimal() {
        return new Animal(randomAge.getAge(0), generationNickAnimal.nameReally());
    }
}
