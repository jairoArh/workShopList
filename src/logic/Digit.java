package logic;

public class Digit {
    private int digit;

    private boolean visited;

    public Digit(int digit) {
        this.digit = digit;
        visited = false;
    }

    public int getDigit() {
        return digit;
    }

    public void setDigit(int digit) {
        this.digit = digit;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
}
