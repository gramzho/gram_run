package com.gram.gram_algorithm.zuidasangeshu;

import java.util.Arrays;

/**
 * @Author: zotij
 * @Date: 2024/4/21 0:34
 */
public class MaxProduct {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 8, 6};
        System.out.println(sort(nums));
    }

    public static int sort(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        return Math.max(nums[0] * nums[1] * nums[n - 1], nums[n - 1] * nums[n - 2] * nums[n - 3]);
    }
}
