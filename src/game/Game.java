package game;

import dice.DiceCup;
import player.Player;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Game {

    private Player player1;
    private Player player2;
    private DiceCup dice;
    private Scanner input;

    public Game()
    {
        input = new Scanner(System.in);
        dice = new DiceCup();

        System.out.println("What is player 1s name?:");
        player1 = new Player(input.nextLine());

        System.out.println("What is player 2s name?:");
        player2 = new Player(input.nextLine());

        System.out.println("Okay " + player1.getName() + ", you start.");

    }

    public void turn1()
    {
        int point;
        // player1 roll dice
        System.out.println("write 'roll' to roll the dice");
        if ("roll".equals(input.nextLine()))
        {
            dice.rollDice();
            System.out.println(dice.getDice1());
            System.out.println(dice.getDice2());

            point = dice.getSum();
            player1.addPoint(point);

            if (dice.twoOne()) {
                System.out.println("You rolled two 1's and lost all of your points.");
                player1.resetPoint();
            }

            System.out.println(player1.getName() + " points");
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
        else
        {
            turn1();
        }



    }
    public void turn2()
    {
        int point;
        //player2 roll dice
        System.out.println("write 'roll' to roll the dice");
        if ("roll".equals(input.nextLine()))
        {
            dice.rollDice();
            System.out.println(dice.getDice1());
            System.out.println(dice.getDice2());

            point = dice.getSum();
            player2.addPoint(point);

            if (dice.twoOne()) {
                System.out.println("You rolled two 1's and lost all of your points.");
                player1.resetPoint();
            }

            System.out.println(player2.getName() + " points");
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
        else
        {
            turn2();
        }
    }

}
