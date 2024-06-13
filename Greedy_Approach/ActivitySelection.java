

import java.util.ArrayList;
import java.util.Arrays;

public class ActivitySelection {

    // Select the maximum number of activities performed by a single person
    public static int[] maxActivities(int[] startTimes, int[] endTimes) {
        if (startTimes == null || endTimes == null || startTimes.length != endTimes.length || startTimes.length == 0) {
            return new int[]{};
        }

        int maxActivities = 1;
        ArrayList<Integer> selectedActivities = new ArrayList<>();

        // Select the first activity
        selectedActivities.add(0);
        int lastEndTime = endTimes[0];

        // Iterate over the activities
        for (int i = 1; i < endTimes.length; i++) {
            if (startTimes[i] >= lastEndTime) {
                maxActivities++; // Activity selected
                selectedActivities.add(i);
                lastEndTime = endTimes[i];
            }
        }

        // Convert ArrayList to array
        int[] result = new int[selectedActivities.size() + 1];
        for (int i = 0; i < selectedActivities.size(); i++) {
            result[i] = selectedActivities.get(i);
        }
        result[result.length - 1] = maxActivities;
        return result;
    }

    public static void main(String[] args) {
        int[] startTimes = {1, 3, 0, 5, 8, 5};
        int[] endTimes = {2, 4, 6, 7, 9, 9};

        int[] result = maxActivities(startTimes, endTimes);

        System.out.println("Selected Activities: " + Arrays.toString(Arrays.copyOf(result, result.length - 1)));
        System.out.println("Total number of activities: " + result[result.length - 1]);
    }
}
