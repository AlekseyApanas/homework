package home_work_1;

import java.util.Scanner;

public class FourTask2 {
    public static void main(String[] args) {
        System.out.println("Enter an integer");
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int numberThree = scanner.nextInt();
        int numberAverage;
        if (numberOne < numberTwo && numberTwo < numberThree || numberOne > numberTwo && numberTwo > numberThree) {
            numberAverage = numberTwo;
            System.out.println("Average number " + numberAverage);
        } else if (numberOne < numberThree && numberOne > numberTwo || numberOne > numberThree && numberOne < numberTwo) {
            numberAverage = numberOne;
            System.out.println("Average number " + numberAverage);
        } else if (numberThree < numberOne && numberThree > numberTwo || numberThree > numberOne && numberThree < numberTwo) {
            numberAverage = numberThree;
            System.out.println("Average number " + numberAverage);
        } else if (numberOne == numberTwo || numberTwo == numberThree || numberOne == numberThree) {
            System.out.println("You enter two identical numbers");
        }
    }
}
