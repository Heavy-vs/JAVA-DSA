package DSA;

import java.util.Arrays;

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int x= 0;
        for(int i =0 ; i<nums.length; i=i+2){
            x=x+nums[i];
        }return x;
    }
}