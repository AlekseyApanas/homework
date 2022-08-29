package home_work_1;

import java.util.Arrays;
import java.util.Scanner;

public class FourTask1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number");
        int number1=scanner.nextInt();
        System.out.println("Enter last number");
        int number2=scanner.nextInt();
        System.out.println(Arrays.toString(getOddNumber(number1,number2)));
    }

    public static int[] getOddNumber(int number1,int number2) {
        int[] result = new int[number2 / 2];
        int j = 0;
        for (int i = number1; i < number2; i++) {
            if (i % 2 != 0) {
                result[j] = i;
                j++;
            }
        }
        return result;
    }
}

