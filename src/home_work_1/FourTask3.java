package home_work_1;

import java.util.Scanner;

public class FourTask3 {
    public static void main(String[] args) {
        System.out.println("Enter  integer");
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        if(getResult(numberOne,numberTwo)){
            System.out.println("Number to divide without remainder = "+numberOne/numberTwo);
        }else{
            System.out.println("remainder = "+(float)numberOne/numberTwo);
        }
    }
public static boolean getResult(int numberOne,int numberTwo){
    return numberOne % numberTwo == 0;
    }
}
