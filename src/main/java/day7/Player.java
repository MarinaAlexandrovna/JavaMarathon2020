package day7;

public class Player {
    private int stamina;
    private final static int MAX_STAMINA = 100;
    private final static int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;

        if (countPlayers < 6) countPlayers++;
    }

    public void run() {
        while (true) {
            if (stamina == 0) {
                countPlayers--;
                break;
            }
            stamina--;
        }
    }

    public static void info() {
        if (countPlayers < 6) {
            System.out.println("Команды не полные. На поле есть есть еще " + (6 - countPlayers) + " свободных мест");
        } else {
            System.out.println("На поле нет свободных места");

        }
    }
}


