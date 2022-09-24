package TowersOfHanoi;

import java.util.Scanner;

public class WorkWithUser {
    public static int gameMode() {
        Scanner scanner = new Scanner(System.in);
        boolean bol=true;
        System.out.println("Выберите режим игры, 1-ручной режим,2 -автоматический режим");
        int numberMode = scanner.nextInt();
        do{
            if(numberMode == 1 || numberMode == 2){
                bol=false;
            }else{
                System.out.println("Выберите режим игры");
                numberMode = scanner.nextInt();
            }
        } while (bol);
        return numberMode;
    }

    public static int contRings() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите кол-во колец,от 3 до 9");
        int countRing = scanner.nextInt();
        boolean bol=true;
        do{
            if(countRing >= 3 && countRing <= 8){
                bol=false;
            }else{
                System.out.println("Выберите кол-во колец,от 3 до 9");
                countRing = scanner.nextInt();
            }
        } while (bol);
        return countRing;
    }
}
