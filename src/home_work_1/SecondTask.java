package home_work_1;

public class SecondTask {
    static int numberEight = 8;
    static int numberTwo = 2;

    public static void main(String[] args) {
        int numberLine = 1;
        int result1 = 5 + numberTwo / numberEight;//5, т.к.2/8 int переменная
        System.out.println(numberLine++ + "." + result1);
        int result2 = (5 + numberTwo) / numberEight;//0, т.к. 7/8 int переменная
        System.out.println(numberLine++ + "." + result2);
        int result3 = (5 + numberTwo++) / numberEight;//0, т.к.  7/8 int переменная(numberTwo++ в данном случае = 2)
        System.out.println(numberLine++ + "." + result3);
        int result4 = (5 + numberTwo++) / --numberEight;//1, т.к.7/7 (--numberEight =7)
        System.out.println(numberLine++ + "." + result4);
        int result5 = (5 * numberTwo >> numberTwo++) / --numberEight;//0, 1010 сдвигается на 2 бита ,10 в двоичной системе,переводим и получаем 2/7 int переменная
        System.out.println(numberLine++ + "." + result5);
        int result6 = (5 + 7 > 20 ? 68 : 22 * numberTwo >> numberTwo++) / --numberEight;//0, т.к. выполняем правую часть ,2/-7 int переменная
        System.out.println(numberLine++ + "." + result6);
        /*int result7 = (5 + 7 > 20 ? 68 >= 68 : 22 * numberTwo >> numberTwo++) / --numberEight;*/ //ошибка компиляции,так как нет левого выражения
        System.out.println(numberLine++ + "." + result5);
        boolean result8 = 6 - numberTwo > 3 && 12 * 12 <= 119;//false, т.к.true and false=false
        System.out.println(numberLine++ + "." + result8);
        boolean result9 = true && false;//false, т.к.true and false=false
        System.out.println(numberLine++ + "." + result9);
    }
}
