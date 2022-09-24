package TowersOfHanoi;

import java.util.Arrays;
import java.util.Scanner;

public class WorkWithGame {
    Scanner scanner = new Scanner(System.in);

    public int[][] buildTower(int count) {
        int[][] towersAndRings = new int[count][3];
        int ring = 1;
        for (int[] towersAndRing : towersAndRings) {
            for (int i = 0; i < towersAndRing.length; i++) {
                towersAndRing[0] = ring;
            }
            ring++;
            System.out.println(Arrays.toString(towersAndRing).replace("0", "*"));
        }
        return towersAndRings;
    }

    public void gameOn(int[][] towersAndRings) {
        int countOfMoves = 0;
        boolean gameOver = true;
        while (gameOver) {
            countOfMoves++;
            playGame(towersAndRings);
            if (towersAndRings[0][1] != 0 || towersAndRings[0][2] != 0) {
                System.out.println("Поздравляем, игра окончина");
                System.out.println("Количество ходов " + countOfMoves);
                break;
            }
            for (int[] array : towersAndRings) {
                System.out.println(Arrays.toString(array).replace("0", "*"));
            }
            System.out.println("Желаете продолжить игру? 1-да,2-нет");
            int yesOrNo = scanner.nextInt();
            if (yesOrNo == 2) {
                gameOver = false;
            }
        }
    }

    public void playGame(int[][] towersAndRings) {
        boolean exception = false;
        int indexI = 0;
        int indexI1 = 0;
        int ring = verifyRing(towersAndRings);
        int tower = verifyTower() - 1;
        for (int i = towersAndRings.length - 1; i >= 0; i--) {
            for (int i1 = 0; i1 < towersAndRings[i].length; i1++) {
                if (i1 == tower && (towersAndRings[i][i1] == 0 || towersAndRings[i][i1] == ring)) {
                    if (i == towersAndRings.length - 1) {
                        towersAndRings[i][i1] = ring;
                        indexI = i;
                        indexI1 = i1;
                        break;
                    } else if (towersAndRings[i + 1][i1] > ring) {
                        towersAndRings[i][i1] = ring;
                        indexI = i;
                        indexI1 = i1;
                        break;
                    } else if (towersAndRings[i + 1][i1] < ring && towersAndRings[i + 1][i1] != 0) {
                        System.out.println("Сюда нельзя поставить кольцо");
                        exception = true;
                    } else if (towersAndRings[i][tower] == ring) {
                        exception = true;
                    }
                }
            }
        }
        for (int i = towersAndRings.length - 1; i >= 0; i--) {
            for (int i1 = 0; i1 < towersAndRings[i].length; i1++) {
                if (towersAndRings[i][i1] == ring && (indexI != i || indexI1 != i1) && !exception) {
                    towersAndRings[i][i1] = 0;
                }
            }
        }
    }

    public int verifyRing(int[][] towersAndRings) {
        System.out.println("Введите кольцо, которое вы хотите перенести");
        int numberRing = scanner.nextInt();
        boolean bol = true;
        do {
            if (numberRing <= towersAndRings.length && numberRing >= 0) {
                for (int i = 0; i < towersAndRings.length; i++) {
                    for (int i1 = 0; i1 < towersAndRings[i].length; i1++) {
                        if (i != 0 && towersAndRings[i - 1][i1] != 0 && towersAndRings[i][i1] == numberRing) {
                            System.out.println("Это кольцо нельзя взять");
                            System.out.println("Введите кольцо, которое хотите перенести");
                            numberRing = scanner.nextInt();
                            break;
                        } else if (towersAndRings[i][i1] == numberRing) {
                            bol = false;
                            break;
                        }
                    }
                }
            } else {
                System.out.println("Кольцо не существует");
                System.out.println("Введите кольцо, которое хотите перенести");
                numberRing = scanner.nextInt();
            }
        } while (bol);
        return numberRing;
    }

    public int verifyTower() {
        System.out.println("Введите номер башни, куда вы хотите перенести кольцо");
        int numberTower = scanner.nextInt();
        boolean bol = true;
        do {
            if (numberTower <= 3 && numberTower > 0) {
                bol = false;
            } else {
                System.out.println("Башни не существует");
                System.out.println("Введите номер башни, куда вы хотите перенести кольцо");
                numberTower = scanner.nextInt();
            }
        } while (bol);
        return numberTower;
    }
}


