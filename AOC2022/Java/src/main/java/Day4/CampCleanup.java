package Day4;

import utils.InputData;

import java.util.Scanner;

public class CampCleanup {

    private static boolean isFullyContained(String assignment1, String assignment2) {
        int[] section1 = getSection(assignment1);
        int[] section2 = getSection(assignment2);
        return false;
    }

    private static int[] getSection(String sectionssStr) {
        int[] sections = {0, 0};
        String[] sectionsSplit = sectionssStr.split("-");
        sections[0] = Integer.valueOf(sectionsSplit[0]);
        sections[1] = Integer.valueOf(sectionsSplit[1]);
        System.out.println(sections);
        return sections;
    }

    public static int assignmentPairs(String listOfAssignments) {
        int totalFullyContainedAssignments = 0;
        String[] sections;
        int[] interval1;
        int[] interval2;
        Scanner assignments = InputData.getInputDataFromFile(listOfAssignments);
        while (assignments.hasNextLine()) {
            sections = assignments.nextLine().split(",");
            if (isFullyContained(sections[0], sections[1])) {
                totalFullyContainedAssignments ++;
            }
        }
        return totalFullyContainedAssignments;
    }

}
