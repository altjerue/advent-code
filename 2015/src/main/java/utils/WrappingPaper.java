package utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class WrappingPaper {
    String inBoxSizes;
    Scanner boxes;

    public WrappingPaper (String boxSizes) {
        this.inBoxSizes = boxSizes;
    }

    private int BoxSurfaceArea(int l, int w, int h) {
        return 2 * (l * w + w * h + h * l);
    }

    private int SmallestSideArea(int l, int w, int h) {
        int smallArea = l * w;

        if (smallArea > w * h) {
            smallArea = w * h;
        }

        if (smallArea > h * l) {
            smallArea = h * l;
        }

        return smallArea;
    }

    private int SmallestSidePerimeter(int l, int w, int h) {
        int smallPerim = 2 * (l + w);

        if (smallPerim > 2 * (w + h)) {
            smallPerim = 2 * (w + h);
        }

        if (smallPerim > 2 * (h + l)) {
            smallPerim = 2 * (h + l);
        }

        return smallPerim;
    }

    public int TotalRequiredPaper() throws FileNotFoundException {
        int l;
        int w;
        int h;
        int totalSurface = 0;

        /*
        Scanner function has this capability of getting a stream of characters.
        In this case from a FileReader class.
         */
        this.boxes = new Scanner(new FileReader(this.inBoxSizes));

        /*
        To iterate through all the lines in our file, we use the hasNextLine
        method in Scanner class.
         */
        while(this.boxes.hasNextLine()) {
            String[] dimensions = this.boxes.nextLine().split("x");
            /* To get an int from a String we use the Integer.parseInt method. */
            l = Integer.parseInt(dimensions[0]);
            w = Integer.parseInt(dimensions[1]);
            h = Integer.parseInt(dimensions[2]);
            totalSurface += BoxSurfaceArea(l, w, h) + SmallestSideArea(l, w, h);
        }

        this.boxes.close();
        return totalSurface;
    }

    public int TotalRequiredRibbon() throws FileNotFoundException {
        int l;
        int w;
        int h;
        int totalLength = 0;

        this.boxes = new Scanner(new FileReader(this.inBoxSizes));

        while(this.boxes.hasNextLine()) {
            String[] dimensions = this.boxes.nextLine().split("x");
            l = Integer.parseInt(dimensions[0]);
            w = Integer.parseInt(dimensions[1]);
            h = Integer.parseInt(dimensions[2]);
            totalLength += (l * w * h) + SmallestSidePerimeter(l, w, h);
        }

        this.boxes.close();
        return totalLength;
    }

}
