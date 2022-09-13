package classwork;

public class Main {
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        task2.intPutFile(task2.outPutFile(task2.collectionStudent(), task2.classWorkFile()));
        task2.intPutFile(task2.outPutFileTop(task2.topStudents(task2.collectionStudent(), 5)));
    }
}
