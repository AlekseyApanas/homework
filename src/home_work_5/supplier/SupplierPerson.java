package home_work_5.supplier;

import home_work_5.classDTO.Person;
import home_work_5.generation.GenerationName;
import home_work_5.generation.GenerationNickPerson;
import home_work_5.generation.RandomPassword;

import java.io.IOException;
import java.util.function.Supplier;

public class SupplierPerson implements Supplier<Person> {
    GenerationName generationName = new GenerationName();
    GenerationNickPerson generationNickPerson = new GenerationNickPerson();
    RandomPassword randomPassword = new RandomPassword();

    /**
     * @return Возвращаем Person
     */
    @Override
    public Person get() {
        try {
            return new Person(generationNickPerson.fromFile(), randomPassword.getPassword(null), generationName.nameReally());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
