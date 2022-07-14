package home_work_1;

import java.util.Scanner;

public class FourTask3 {
    public static void main(String[] args) {
        System.out.println("Enter  integer");
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        if(numberOne%numberTwo==0){
            int result=numberOne/numberTwo;
            System.out.println("Number to divide without remainder = "+result);
        }else{
            float remainder=(float) numberOne/numberTwo;
            System.out.println("remainder = "+remainder);
        }
    }
}
