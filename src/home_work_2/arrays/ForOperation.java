package home_work_2.arrays;

public class ForOperation implements IArraysOperation {
    /**
     * Класс ForOperation используя интерфейс IArraysOperation:
     * forOperation.allElementFor() - выводит все элементы массива в консоль
     * forOperation.replaceArrayFor() - выводит все элементы массива в консоль в обратном порядке
     * forOperation.deleteElementFor() - выводит каждый второй элемент массива в консоль
     */
    public static void main(String[] args) {
        ForOperation forOperation = new ForOperation();
        IArraysOperation.allElementsFor();
        IArraysOperation.replaceElementsFor();
        IArraysOperation.deleteElementsFor();
    }
}
