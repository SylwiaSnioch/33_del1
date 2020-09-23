package game;

import dice.DiceCup;
import player.Player;

public class Game {
    public int lol;

    private Player player1;
    private Player player2;
    private DiceCup dice;

    public Game()
    {
        lol=4;
        dice = new DiceCup();
    }

    public void turn1()
    {
        int point;
        dice.rollDice();
        System.out.println(dice.getDice1());
        System.out.println(dice.getDice2());

        /*
        player1 roll dice
        dice.rollDice();
        point = dice.getSum();
        player1.addPoint(point);
        System.out.println("player1 points");
        System.out.println(player1.getPoints());
        if (player1.getPoints() > 40)
        {
            System.out.println("game over");
            return;
        }
        else
        {
            turn2();
        }
         */
    }
    public void turn2()
    {
        int point;
        dice.rollDice();
        System.out.println(dice.getDice1());
        System.out.println(dice.getDice2());

        /*
        player1 roll dice
        dice.rollDice();
        point = dice.getSum();
        player2.addPoint(point);
        System.out.println("player2 points");
        System.out.println(player2.getPoints());
        if (player2.getPoints() > 40)
        {
            System.out.println("game over");
            return;
        }
        else
        {
            turn1();
        }
         */
    }

}
