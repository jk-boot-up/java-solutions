package com.jk.explore.generic.problems.solutions.twosum;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {

    /**
     * Returns indices of two integers whose sum is <i>sum</i>.
     * If no such combination present then returns null
     * <p>
     *     <br>space complexity O(n)
     *     <br>time complexity O(n)
     *     <br>n: length of numbers list
     * </p>
     * @param numbers
     * @param sum
     * @return
     */
    public int[] findIndices(List<Integer> numbers, int sum) {
        if(numbers == null || numbers.isEmpty() || numbers.size() < 2) {
            return null;
        }
        // space complexity: O(n)
        Map<Integer, Integer> visitedNumbersMap = new HashMap<>();
        // time complexity O(n)
        for(int i=0; i<numbers.size(); i++) {
            int current = numbers.get(i);
            int numberToFind = sum - current;
            if(visitedNumbersMap.containsKey(numberToFind)) {
                // time complexity : O(1)
                return new int[] {visitedNumbersMap.get(numberToFind), i};
            }
            visitedNumbersMap.put(numbers.get(i), i);
        }
        return null;
    }


}
