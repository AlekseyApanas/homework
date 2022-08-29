


package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class FourTask4 {
    public static void main(String[] args) {
        System.out.println("Enter b(bytes) or k(KBytes)");
        Scanner scannerLetter = new Scanner(System.in);
        String bytesOrkBytes = scannerLetter.nextLine();
        System.out.println("Enter amount");
        Scanner scannerNumbers = new Scanner(System.in);
        int amountByteOrKByte = scannerNumbers.nextInt();
        System.out.println(getResult(bytesOrkBytes, amountByteOrKByte));
    }

    public static double getResult(String bytesOrkBytes, int amountByteOrkByte) {
        int amount = 1024;
        String bytes = "b";
        double result;
        if (Objects.equals(bytesOrkBytes, bytes)) {
            result = amountByteOrkByte * amount;
            return result;
        } else {
            result = (double) amountByteOrkByte / amount;
            return result;
        }
    }
}
