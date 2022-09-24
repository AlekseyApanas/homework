package TowersOfHanoi;

public class Main {
    public static void main(String[] args) {
        WorkWithUser.gameMode();
        int b = WorkWithUser.contRings();
        WorkWithGame workWithGame = new WorkWithGame();
        workWithGame.gameOn(workWithGame.buildTower(b));
    }
}
