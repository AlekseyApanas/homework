package home_work_1;

import java.util.Scanner;

public class FourTask5 {
    public static void main(String[] args) {
        int minCodeUppercase = 81;
        int maxCodeUppercase = 106;
        int minCodeLowercase = 113;
        int maxCodeLowercase = 122;
        System.out.println("Enter the letter");
        Scanner scanner = new Scanner(System.in);
        char symbol = scanner.nextLine().charAt(0);
        int codeSymbol = (int) symbol;
        if (codeSymbol >= minCodeUppercase && codeSymbol <= maxCodeUppercase || codeSymbol >= minCodeLowercase && codeSymbol <= maxCodeLowercase) {
            System.out.println("You enter a letter");
        } else {
            System.out.println("You enter a symbol");
        }
    }
}
