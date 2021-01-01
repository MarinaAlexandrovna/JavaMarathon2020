package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        //игроки выходят на поле
        Player player1 = new Player(rand.nextInt(11) + 90);
        Player player2 = new Player(rand.nextInt(11) + 90);
        Player player3 = new Player(rand.nextInt(11) + 90);
        //проверка заполенности команды.
        Player.info();
//следующие игроки выходят на поле.
        Player player4 = new Player(rand.nextInt(11) + 90);
        Player player5 = new Player(rand.nextInt(11) + 90);
        Player player6 = new Player(rand.nextInt(11) + 90);
// проверка заполненности поляю
        Player.info();
        //Игрок начинает бегать.
        player1.run();

        Player.info();

        Player player7 = new Player(rand.nextInt(11) + 90);

        Player.info();

        player2.run();
        player3.run();
        player5.run();

        Player.info();
    }
}
