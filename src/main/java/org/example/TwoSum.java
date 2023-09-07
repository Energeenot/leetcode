package org.example;


public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target) {
//                    System.out.println("[" + i + "," + j + "]");
//                    System.out.println(nums.length);
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    // twoSum решение
    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 4};
        int target = 7;
        TwoSum twoSu = new TwoSum();
        System.out.println();
        twoSu.twoSum(nums, target);
    }
}