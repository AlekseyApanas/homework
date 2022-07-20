package home_work_2.arrays;

public class ForEachOperation implements IArraysOperation {
    /**
     * Класс ForeachOperation используя интерфейс IArraysOperation:
     * foreachOperation.allElementForeach() - выводит все элементы массива в консоль
     * foreachOperation.replaceArrayForeach() - выводит все элементы массива в консоль в обратном порядке
     * foreachOperation.deleteElementForeach() - выводит каждый второй элемент массива в консоль
     */
    public static void main(String[] args) {
        ForEachOperation foreachOperation = new ForEachOperation();
        foreachOperation.allElementsForeach();
        foreachOperation.replaceElementsForeach();
        foreachOperation.deleteElementsForeach();
    }
}
