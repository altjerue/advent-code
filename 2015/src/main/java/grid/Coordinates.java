package grid;

import java.util.ArrayList;

public class Coordinates {
    int x; // horizontal axis
    int y; // vertical axis

    public Coordinates() {
        this.x = 0;
        this.y = 0;
    }
    public Coordinates(int x, int y) {
        this.setCoordinates(x, y);
    }

    public static boolean isCoordinateNotInPath(Coordinates newCoordinates, ArrayList<Coordinates> path) {
        boolean coordinateNotInPath = false;
        for (Coordinates c : path) {
            if (!c.compareCoordinates(newCoordinates)) {
                coordinateNotInPath = true;
            } else {
                coordinateNotInPath = false;
                break;
            }
        }
        path.add(newCoordinates);
        return coordinateNotInPath;
    }

    public boolean compareCoordinates(Coordinates coord) {
        if (this.x == coord.x && this.y == coord.y) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Integer> getCoordinates() {
        ArrayList<Integer> coords = new ArrayList<>();
        coords.add(this.x);
        coords.add(this.y);
        return coords;
    }

    public void setCoordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Coordinates shiftCoordinate(char move, int shiftEW, int shiftNS) {
        switch (move) {
            case '^':
                shiftNS += 1;
                break;
            case 'v':
                shiftNS -= 1;
                break;
            case '>':
                shiftEW += 1;
                break;
            case '<':
                shiftEW -= 1;
                break;
        }

        return new Coordinates(shiftEW, shiftNS);
    }

}
