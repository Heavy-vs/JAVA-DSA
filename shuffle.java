package DSA;

class Solution {
    public int[] shuffle(int[] nums, int n) {
    int[] x = new int [2*n];
    for(int i = 0; i<n;i++){
            x[2*i]=nums[i];
            x[2*i+1]= nums[i+n];
    }
        
    return x;
    }
}