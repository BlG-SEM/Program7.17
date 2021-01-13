package ru.vsu.cs.logic;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static int findMaxSum(int[] arr) {
        List<Integer> currentList = new ArrayList<>();
        List<List<Integer>> combinations = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            currentList.clear();
            currentList.add(arr[i]);
            combinations.add(new ArrayList<>(currentList));

            for (int j = i + 1; j < arr.length; j++) {
                currentList.add(arr[j]);
                combinations.add(new ArrayList<>(currentList));
            }
        }
        return findMaxSum(combinations);
    }

    private static int findMaxSum(List<List<Integer>> combinations) {
        if (combinations.isEmpty()) return 0;
        int maxSum = getCombinationSum(combinations.get(0));
        for (int i = 1; i < combinations.size(); i++) {
            int currentSum = getCombinationSum(combinations.get(i));
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        return maxSum;
    }

    private static int getCombinationSum(List<Integer> combination) {
        int sum = 0;
        for (Integer i:
             combination) {
            sum += i;
        }
        return sum;
    }
}
