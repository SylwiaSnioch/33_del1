package dice;

import java.util.Random;

public class DiceCup {

    // Vi anvender os af random klassen til at generere vores terninge værdier
    private final Random random = new Random();

    // Vi erklærer to int terning variabler
    private int dice1;
    private int dice2;

    // Vi tester vores dice.test(); funktion
    public static void main(String[] args) {
        DiceCup dice = new DiceCup();
        dice.test();
    }

    // Vi indsætter en tilfældig værdi fra 1-6 til vores dice1 og dice2 variabler
    public void rollDice() {
        dice1 = random(6) + 1;
        dice2 = random(6) + 1;
    }

    // Siden vores dice1 variabel er erklæret private anvender vi os af public int get()
    public int getDice1() {
        return dice1;
    }

    // Siden vores dice2 variabel er erklæret private anvender vi os af public int get()
    public int getDice2() {
        return dice2;
    }

    // Vi anvender os af boolsk udtryk og tjekker om dice1 er tilsvarende til dice2 værdien.
    public boolean isSimiliar() {
        return dice1 == dice2;
    }

    // Vi anvender os af et loop og gentager handlingen 1000 gange for at se om rollDice() virker
    public void test() {
        for (int i = 0; i < 1001; i++) {
            rollDice();
            System.out.println("You rolled " + dice1 + " and " + dice2);
        }
    }

    // Vores random funktion genererer en værdi (value parameter)
    public int random(int value) {
        return random.nextInt(value);
    }

}
