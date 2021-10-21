import game.redgreen.Game;

import static game.redgreen.Game.isLoser;

public class Main {
    public static void main(String[] args) {

        int speedOfPlayer1 = 5;
        int speedOfPlayer2 = 0;
        int speedOfPlayer3 = 2;

        int loserCount = 0;

        if (isLoser(speedOfPlayer1)) {
            loserCount++;
        }
        if (isLoser(speedOfPlayer2)) {
            loserCount++;
        }
        if (isLoser(speedOfPlayer3)) {
            loserCount++;
        }

        System.out.println("Всего выбыло " + loserCount + " игроков");
    }
}
