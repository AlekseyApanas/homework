package home_work_5.creatCollection;

import home_work_5.classDTO.Animal;
import home_work_5.supplier.SupplierAnimal;
import java.util.Collection;
public class CreateCollectionAnimal {

    /**
     * Заполняем collection Animal и считаем время заполнения
     */
    public void addAnimal(Collection<Animal>collection) {
        for (int i = 0; i < 10_000; i++) {
            SupplierAnimal supplierAnimal=new SupplierAnimal();
            collection.add(supplierAnimal.get());
        }
    }
}
