package org.norbertsusztek.array_one;

public class SameFirstLast {
    public boolean sameFirstLast(int[] nums) {
        int length = nums.length;
        if(length>=1 && nums[0]==nums[length-1]){
            return true;
        }
        return false;
    }
}
