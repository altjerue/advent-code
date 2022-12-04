package Day3;

import utils.Duplicates;
import utils.InputData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static utils.Duplicates.removeDuplicates;

public class Rucksacks {

    public static int findPriorities(String itemsFile) {
        String firstCompartment;
        String secondCompartment;
        String items;
        int totalPriority = 0;
        int currentPriority = 0;
        Scanner allItems = InputData.getInputDataFromFile(itemsFile);

        while (allItems.hasNextLine()) {
            items = allItems.nextLine();
            firstCompartment = Duplicates.removeDuplicates(items.substring(0, items.length() / 2));
            secondCompartment = Duplicates.removeDuplicates(items.substring(items.length() / 2));
            for (int i = 0; i < firstCompartment.length(); i++) {
                for (int j = 0; j < secondCompartment.length(); j++) {
                    if (firstCompartment.charAt(i) == secondCompartment.charAt(j))
                        totalPriority += Priorities.getPriority(firstCompartment.charAt(i));
                }
            }
        }
        return totalPriority;
    }

    public static int findPrioritiesByGroups(String itemsFile) {
        String firstCompartment;
        String secondCompartment;
        String thirdCompartment;
        List<String> items = null;
        int totalPriority = 0;
        int currentPriority = 0;
        Scanner allItems = InputData.getInputDataFromFile(itemsFile);

        while (allItems.hasNextLine()) {
            firstCompartment = Duplicates.removeDuplicates(allItems.nextLine());
            secondCompartment = Duplicates.removeDuplicates(allItems.nextLine());
            thirdCompartment = Duplicates.removeDuplicates(allItems.nextLine());
            for (int i = 0; i < firstCompartment.length(); i++) {
                for (int j = 0; j < secondCompartment.length(); j++) {
                    if (firstCompartment.charAt(i) == secondCompartment.charAt(j)) {
                        for (int k = 0; k < thirdCompartment.length(); k++) {
                            if (firstCompartment.charAt(i) == thirdCompartment.charAt(k))
                                totalPriority += Priorities.getPriority(firstCompartment.charAt(i));
                        }
                    }
                }
            }
        }
        return totalPriority;
    }
}
