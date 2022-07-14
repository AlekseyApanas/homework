


package home_work_1;

import java.util.Scanner;

public class FourTask4 {
    public static void main(String[] args) {
        String bytes = "b";
        String kByte = "k";
        int amount = 1000;
        int result;
        System.out.println("Enter b(bytes) or k()KBytes");
        Scanner scannerLetter = new Scanner(System.in);
        String bytesOrkBytes = scannerLetter.nextLine();
        System.out.println("Enter amount");
        Scanner scannerNumbers = new Scanner(System.in);
        int amountByteOrKByte = scannerNumbers.nextInt();
        if (bytesOrkBytes == bytes) {
            result = amountByteOrKByte * amount;
            System.out.println(result+"byte");
        } else {
            result = amountByteOrKByte / amount;
            System.out.println(result+"kByte");
        }
    }
}
