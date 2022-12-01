package Day1;

import utils.InputData;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Calories {

    public static int maxCalories(String caloriesFile) {
        int maxCalories = 0;
        int curCaloriesCount = 0;
        String nextCalories;
        ArrayList<Integer> calories = new ArrayList<>();
        Scanner allCalories = InputData.getInputDataFromFile(caloriesFile);
        while (allCalories.hasNext()) {
            nextCalories = allCalories.nextLine();
            if (nextCalories.isEmpty()) {
                curCaloriesCount = howManyCalories(calories);
                if (curCaloriesCount > maxCalories) maxCalories = curCaloriesCount;
                calories = new ArrayList<>();
            } else {
                calories.add(Integer.valueOf(nextCalories));
            }
        }
        return maxCalories;
    }

    public static int max3Calories(String caloriesFile) {
        int maxCalories = 0;
        int curCaloriesCount = 0;
        int[] max3Calories = {0, 0, 0};
        boolean stopCounting = false;
        String nextCalories;
        ArrayList<Integer> calories = new ArrayList<>();

        max3Calories[0] = maxCalories(caloriesFile);
        Scanner allCalories = InputData.getInputDataFromFile(caloriesFile);
        nextCalories = allCalories.nextLine();

        while (true) {

            if (nextCalories.isEmpty()) {
                curCaloriesCount = howManyCalories(calories);
                if (curCaloriesCount < max3Calories[0]) {
                    if (curCaloriesCount > max3Calories[2]) max3Calories[2] = curCaloriesCount;
                    if (curCaloriesCount > max3Calories[1]) {
                        max3Calories[2] = max3Calories[1];
                        max3Calories[1] = curCaloriesCount;
                    }
                }
                calories = new ArrayList<>();
            } else {
                calories.add(Integer.valueOf(nextCalories));
            }

            if (stopCounting) break;
            if (!allCalories.hasNextLine()) {
                nextCalories = "";
                stopCounting = true;
            } else {
                nextCalories = allCalories.nextLine();
            }

        }

        maxCalories = max3Calories[0] + max3Calories[1] + max3Calories[2];
        return maxCalories;
    }

    private static int howManyCalories(ArrayList<Integer> inCalories) {
        int thisManyCalories = 0;
        for (int i = 0; i < inCalories.size(); i++) {
            thisManyCalories += inCalories.get(i);
        }
        return thisManyCalories;
    }

}
