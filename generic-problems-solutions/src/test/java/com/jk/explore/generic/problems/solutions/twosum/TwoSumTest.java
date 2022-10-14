package com.jk.explore.generic.problems.solutions.twosum;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest {

    private TwoSum twoSum = new TwoSum();

    @Test
    public void validInput1() {
        List<Integer> numbers = Arrays.asList(3, 4, 6, 8, 5, 9);
        int[] result = twoSum.findIndices(numbers, 10);
        assertArrayEquals(new int[] {1, 2}, result);
    }

}
