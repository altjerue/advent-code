package Day2;

import utils.InputData;

import java.util.Scanner;

public class WrappingPaper {
    String inBoxSizes;
    Scanner boxes;

    public WrappingPaper (String boxSizes) {
        this.inBoxSizes = boxSizes;
    }

    private int boxSurfaceArea(int l, int w, int h) {
        return 2 * (l * w + w * h + h * l);
    }

    private int smallestSideArea(int l, int w, int h) {
        int smallArea = l * w;

        if (smallArea > w * h) {
            smallArea = w * h;
        }

        if (smallArea > h * l) {
            smallArea = h * l;
        }

        return smallArea;
    }

    private int smallestSidePerimeter(int l, int w, int h) {
        int smallPerim = 2 * (l + w);

        if (smallPerim > 2 * (w + h)) {
            smallPerim = 2 * (w + h);
        }

        if (smallPerim > 2 * (h + l)) {
            smallPerim = 2 * (h + l);
        }

        return smallPerim;
    }

    public int totalRequiredPaper() {
        int l;
        int w;
        int h;
        int totalSurface = 0;

        /*
        Scanner function has this capability of getting a stream of characters.
        In this case from a FileReader class.
         */
        this.boxes = InputData.getInputDataFromFile(this.inBoxSizes);

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
            totalSurface += boxSurfaceArea(l, w, h) + smallestSideArea(l, w, h);
        }

        this.boxes.close();
        return totalSurface;
    }

    public int totalRequiredRibbon() {
        int l;
        int w;
        int h;
        int totalLength = 0;

        this.boxes = InputData.getInputDataFromFile(this.inBoxSizes);

        while(this.boxes.hasNextLine()) {
            String[] dimensions = this.boxes.nextLine().split("x");
            l = Integer.parseInt(dimensions[0]);
            w = Integer.parseInt(dimensions[1]);
            h = Integer.parseInt(dimensions[2]);
            totalLength += (l * w * h) + smallestSidePerimeter(l, w, h);
        }

        this.boxes.close();
        return totalLength;
    }

}
