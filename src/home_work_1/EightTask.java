package home_work_1;

import java.util.Arrays;
import java.util.Scanner;

public class EightTask {
    public static void main(String[] args) {
        System.out.println("Enter a number from -127 do 128");
        Scanner scanner = new Scanner(System.in);
        byte number = scanner.nextByte();
        String finalBinaryCode = toBinaryString(number);
        System.out.println(finalBinaryCode);

    }

    public static String toBinaryString(byte number) {
        int originalNumber = number;
        int[] array = new int[8];
        for (int i = array.length - 1; i >= 0; i--) {
            if (number % 2 == 0) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
            number /= 2;
            if (originalNumber < 0) {
                if (array[i] == 0) {
                    array[i] = 1;
                } else {
                    array[i] = 0;
                }
            }
        }
        String arrayString = Arrays.toString(array);
        arrayString = arrayString.substring(1, 23);
        return arrayString;
    }
}
