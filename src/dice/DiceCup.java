package dice;

import java.util.Random;

public class DiceCup {

    private final Random random = new Random();

    private int dice1;
    private int dice2;

    public static void main(String[] args) {
        DiceCup dice = new DiceCup();
        dice.test();
    }

    public void rollDice() {
        dice1 = random(6) + 1;
        dice2 = random(6) + 1;
    }

    public int getDice1() {
        return dice1;
    }

    public int getDice2() {
        return dice2;
    }

    public boolean isSimiliar() {
        return dice1 == dice2;
    }

    public void test() {
        for (int i = 0; i < 1001; i++) {
            rollDice();
            System.out.println("You rolled " + dice1 + " and " + dice2);
        }
    }

    public int random(int value) {
        return random.nextInt(value);
    }

}
