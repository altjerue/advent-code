package utils;

public class Grid {
    int xMax;
    int yMax;

    public Grid() {
        this.xMax = 1000;
        this.yMax = 1000;
    }

    public Grid(int x, int y) {
        this.xMax = x;
        this.yMax = y;
    }

    public int[][] buildIntegerGrid() {
        return new int[this.xMax][this.yMax];
    }

    public boolean[][] buildBooleanGrid() {
        return new boolean[this.xMax][this.yMax];
    }

}
