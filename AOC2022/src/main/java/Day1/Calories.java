package Day1;

import utils.InputData;

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

    private static int howManyCalories(ArrayList<Integer> inCalories) {
        int thisManyCalories = 0;
        for (int i = 0; i < inCalories.size(); i++) {
            thisManyCalories += inCalories.get(i);
        }
        return thisManyCalories;
    }

}
