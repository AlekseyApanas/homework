package home_work_2.arrays;

public class DoWhileOperation implements IArraysOperation {
    /**
     * Класс DoWhileOperation используя интерфейс IArraysOperation :
     * doWhileOperation.allElementFor() - выводит все элементы массива в консоль
     * doWhileOperation.replaceArrayFor() - выводит все элементы массива в консоль в обратном порядке
     * doWhileOperation.deleteElementFor() - выводит каждый второй элемент массива в консоль
     */
    public static void main(String[] args) {
        DoWhileOperation doWhileOperation = new DoWhileOperation();
        IArraysOperation.allElementsDoWhile();
        IArraysOperation.replaceElementsDoWhile();
        IArraysOperation.deleteElementsDoWhile();
    }
}

