package player;

public class Player {
    private int point;
    private int lastdice1;
    private int lastdice2;
    public int getPoint() {
        return point;
    }
    public void resetPoint() {
        point = 0;
    }
    public void addPoint(int point) {
        this.point += point;

    }
    public int getlastdice1() {
        return lastdice1;
    }
    public int getLastdice2() {
        return lastdice2;
    }
    public void setlastdice1(int eyes) {
        lastdice1 = eyes;
    }
    public void setlastdice2(int eyes) {
        lastdice2 = eyes;
    }
}
