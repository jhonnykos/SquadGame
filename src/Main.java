public class Main {
    public static void main(String[] args) {
        boolean isGreenLight = false;

        int speedOfPlayer1 = 5;
        int speedOfPlayer2 = 2;
        int speedOfPlayer3 = 1;

        int loserCount = 0;

        if (!isGreenLight) {
            if (speedOfPlayer1 > 0) {
                loserCount++;
            }
            if (speedOfPlayer2 > 0) {
                loserCount++;
            }
            if (speedOfPlayer3 > 0) {
                loserCount++;
            }
        }

        System.out.println("Всего выбыло " + loserCount + " игроков");
    }
}
