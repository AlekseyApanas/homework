package home_work_1;
import java.util.Scanner;
public class FourTask2 {
    public static void main(String[] args) {
        System.out.println("Enter an integer");
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int numberThree = scanner.nextInt();
        System.out.println("Average number " + getAverage(numberOne, numberTwo, numberThree));
    }

    public static int getAverage(int numberOne, int numberTwo, int numberThree) {
        int numberAverage;
        if (numberOne < numberTwo && numberTwo < numberThree || numberOne > numberTwo && numberTwo > numberThree) {
            numberAverage = numberTwo;
            return numberAverage;
        } else if (numberOne < numberThree && numberOne > numberTwo || numberOne > numberThree && numberOne < numberTwo) {
            numberAverage = numberOne;
            return numberAverage;
        } else if (numberThree < numberOne && numberThree > numberTwo || numberThree > numberOne && numberThree < numberTwo) {
            numberAverage = numberThree;
            return numberAverage;
        } else {
            return 0;
        }
    }
}

