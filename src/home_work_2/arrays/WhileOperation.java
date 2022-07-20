package home_work_2.arrays;

public class WhileOperation implements IArraysOperation {
    /**
     * Класс WhileOperation используя интерфейс IArraysOperation:
     * WhileOperation.allElementWhile() - выводит все элементы массива в консоль
     * WhileOperation.replaceArrayWhile() - выводит все элементы массива в консоль в обратном порядке
     * WhileOperation.deleteElementWhile() - выводит каждый второй элемент массива в консоль
     */
    public static void main(String[] args) {
        WhileOperation whileOperation = new WhileOperation();
        whileOperation.allElementsWhile();
        whileOperation.replaceElementsWhile();
        whileOperation.deleteElementsWhile();
    }
}
