package com.jk.explore.generic.problems.solutions.twosum;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class TwoSum2 {

    /**
     * Returns indices of two integers whose sum is <i>sum</i>.
     * If no such combination present then returns null
     * <p>
     *     <br>space complexity O(n)
     *     <br>time complexity O(n)
     *     <br>n: length of numbers list
     * </p>
     * @param numbers list of numbers
     * @param sum target sum
     * @return int[] with 2 indices
     */
    public int[] findIndices(final List<Integer> numbers, final int sum) {
        if(numbers == null || numbers.isEmpty() || numbers.size() < 2) {
            return null;
        }
        // space complexity: O(n)
        final Map<Integer, Integer> visitedNumbersMap = new HashMap<>();
        final int[] results = new int[]{-1, -1};
        // time complexity O(n)
        IntStream.range(0, numbers.size()).forEach(i -> {
            int current = numbers.get(i);
            int numberToFind = sum - current;
            if(visitedNumbersMap.containsKey(numberToFind)) {
                // time complexity : O(1)
                results[0] = visitedNumbersMap.get(numberToFind);
                results[1] = i;
            }
            visitedNumbersMap.put(numbers.get(i), i);
        });
        if(results[0] != -1) {
            return null;
        }
        return results;
    }
}
