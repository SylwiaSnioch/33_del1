package game;

import dice.DiceCup;
import player.Player;

public class Game {
    private Player player1;
    private Player player2;
    private DiceCup dice;

    public Game()
    {
        dice = new DiceCup();
        player1 = new Player("player25");
        player2 = new Player("player2");

    }

    public void turn1()
    {
        int point;
        dice.rollDice();
        System.out.println(dice.getDice1());
        System.out.println(dice.getDice2());


        // player1 roll dice
        dice.rollDice();
        point = dice.getSum();
        player1.addPoint(point);
        System.out.println("player1 points");
        System.out.println(player1.getPoint());
        if (player1.getPoint() > 40)
        {
            System.out.println("game over");
            return;
        }
        else
        {
            turn2();
        }

    }
    public void turn2()
    {
        int point;
        dice.rollDice();
        System.out.println(dice.getDice1());
        System.out.println(dice.getDice2());


        //player2 roll dice
        dice.rollDice();
        point = dice.getSum();
        player2.addPoint(point);
        System.out.println("player2 points");
        System.out.println(player2.getPoint());
        if (player2.getPoint() > 40)
        {
            System.out.println("game over");
            return;
        }
        else
        {
            turn1();
        }

    }

}
