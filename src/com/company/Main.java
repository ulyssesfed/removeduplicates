package com.company;

import java.util.Arrays;

public class Main {
private static int[] nums = {1,1,3,6,5,4,4,4,3,2,22,2,2,3,4,5,6,7,8,9,10};
    public static void main(String[] args) {
        removeDuplicates(nums);
    }

    private static void removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;
        while (j < nums.length) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
            j++;
        }
        System.out.println(Arrays.toString(nums));
    }
}

