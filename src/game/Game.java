package game;

import dice.DiceCup;
import player.Player;
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
        player1 = new Player("player1");
        player2 = new Player("player2");

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
            System.out.println("player1 points");
            System.out.println(player1.getPoint());

            // player wins if they roll two sixes two turns in a row
            if (dice.getDice1() == 6 && dice.getDice2() == 6 && player1.getlastdice1() == 6 && player1.getLastdice2() == 6)
            {
                System.out.println("game over");
                System.out.println(player1.getName() + " has won the game");
                return;
            }
            else
            {
                player1.setlastdice1(dice.getDice1());
                player1.setlastdice2(dice.getDice2());
            }

            if (player1.getPoint() > 40)
            {
                System.out.println("game over");
                System.out.println(player1.getName() + " has won the game");
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
            System.out.println("player2 points");
            System.out.println(player2.getPoint());

            // player wins if they roll two sixes two turns in a row
            if (dice.getDice1() == 6 && dice.getDice2() == 6 && player2.getlastdice1() == 6 && player2.getLastdice2() == 6)
            {
                System.out.println("game over");
                System.out.println(player2.getName() + " has won the game");
                return;
            }
            else
            {
                player2.setlastdice1(dice.getDice1());
                player2.setlastdice2(dice.getDice2());
            }

            if (player2.getPoint() > 40)
            {
                System.out.println("game over");
                System.out.println(player2.getName() + " has won the game");
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
