package home_work_2.loops;

public class FirstTask1_6 {
    /**
     * Вывели на консоль таблицу умножения
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print("\tj"+"*"+"i"+"="+j*i+" ");
            }
            System.out.println("");
        }
    }
}
