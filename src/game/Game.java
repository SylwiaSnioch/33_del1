package game;

import dice.DiceCup;
import player.Player;

import java.util.Scanner;

public class Game {

    private final Player player1;
    private final Player player2;
    private final DiceCup dice;
    private final Scanner input;

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

        if (player1.getPoint() >= 40)
            System.out.println(player1.getName() + " has to roll two identical to win the game.");

        System.out.println(player1.getName() + " write 'roll' to dice");
        if ("roll".equalsIgnoreCase(input.nextLine()))
        {
            dice.rollDice();
            System.out.println(dice.getDice1());
            System.out.println(dice.getDice2());

            if (dice.twoOne()) {
                System.out.println("You rolled two 1's and lost all of your points.");
                player1.resetPoint();
                turn2();
                return;
            }

            if (player1.getPoint() < 40 && dice.isSimiliar()) {
                System.out.println(player1.getName() + " gets an extra turn!");
                turn1();
                return;
            } else if (player1.getPoint() >= 40 && dice.isSimiliar()) {
                System.out.println(player1.getName() + " has won the game.");
                return;
            }

            player1.addPoint(dice.getSum());

            if (player1.getPoint() < 40)
                System.out.println(player1.getName() + " has " + player1.getPoint() + " points.");

            turn2();

        }

    }

    public void turn2()
    {

        if (player2.getPoint() >= 40)
            System.out.println(player2.getName() + " has to roll two identical to win the game.");

        System.out.println(player2.getName() + " write 'roll' to dice");

        if ("roll".equalsIgnoreCase(input.nextLine())) {
            dice.rollDice();
            System.out.println(dice.getDice1());
            System.out.println(dice.getDice2());

            if (dice.twoOne()) {
                System.out.println("You rolled two 1's and lost all of your points.");
                player2.resetPoint();
                turn1();
                return;
            }

            if (player2.getPoint() < 40 && dice.isSimiliar()) {
                System.out.println(player2.getName() + " gets an extra turn!");
                turn2();
                return;
            } else if (player2.getPoint() >= 40 && dice.isSimiliar()) {
                System.out.println(player2.getName() + " has won the game");
                return;
            }

            player2.addPoint(dice.getSum());

            if (player2.getPoint() < 40)
                System.out.println(player2.getName() + " has " + player2.getPoint() + " points.");

            turn1();

        }
    }

}
