package home_work_5.creatCollection;

import home_work_5.classDTO.Person;
import home_work_5.supplier.SupplierPerson;

import java.util.Collection;


public class CreateCollectionPerson {
    /**
     * Заполняем collection Person и считаем время заполнения
     */
    public void addPerson(Collection<Person> collection) {
        for (int i = 0; i < 10_000; i++) {
            SupplierPerson supplierPerson = new SupplierPerson();
            collection.add(supplierPerson.get());
        }
    }
}
