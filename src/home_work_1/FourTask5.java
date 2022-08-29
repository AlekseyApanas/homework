package home_work_1;

import java.util.Scanner;

public class FourTask5 {
    public static void main(String[] args) {
        System.out.println("Enter the letter");
        Scanner scanner = new Scanner(System.in);
        char symbol = scanner.nextLine().charAt(0);
        if (getResult(symbol)) {
            System.out.println("You enter a letter");
        } else {
            System.out.println("You enter a symbol");
        }
    }

    public static boolean getResult(char charLetter) {
        int minCodeUppercase = 81;
        int maxCodeUppercase = 106;
        int minCodeLowercase = 113;
        int maxCodeLowercase = 122;
        return (int) charLetter >= minCodeUppercase && (int) charLetter <= maxCodeUppercase || (int) charLetter >= minCodeLowercase && (int) charLetter <= maxCodeLowercase;
    }
}
