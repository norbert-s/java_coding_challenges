package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

    }
    public static int[] makeEnds(int[] nums) {
        int[] nums2={0,0};

            nums2[0] = nums[0];
            nums2[1] = nums[nums.length-1];
            return nums2;
    }
}
