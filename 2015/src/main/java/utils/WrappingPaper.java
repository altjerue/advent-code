package utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class WrappingPaper {
    int length;
    int width;
    int height;
    Scanner boxes;

    public WrappingPaper (String boxSizes) throws FileNotFoundException {
        /*
        Scanner function has this capability of getting a stream of characters.
        In this case from a FileReader class.
         */
        this.boxes = new Scanner(new FileReader(boxSizes));
    }

    private int boxSurfaceArea(int l, int w, int h) {
        return 2 * (l * w + w * h + h * l);
    }

    private int smallestSideArea(int l, int w, int h) {
        int smallSide = l * w;

        if (smallSide > w * h) {
            smallSide = w * h;
        }

        if (smallSide > h * l) {
            smallSide = h * l;
        }

        return smallSide;
    }

    public int totalRequiredPaper() {
        int totalSurface = 0;

        /*
        To iterate through all the lines in our file, we use the hasNextLine
        method in Scanner class.
         */
        while(this.boxes.hasNextLine()) {
            String[] dimensions = this.boxes.nextLine().split("x");
            /* To get an int from a String we use the Integer.parseInt method. */
            int l = Integer.parseInt(dimensions[0]);
            int w = Integer.parseInt(dimensions[1]);
            int h = Integer.parseInt(dimensions[2]);
            totalSurface += boxSurfaceArea(l, w, h) + smallestSideArea(l, w, h);
        }
        return totalSurface;
    }
}
