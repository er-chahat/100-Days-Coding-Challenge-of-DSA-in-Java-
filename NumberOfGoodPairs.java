//Given an array of integers nums, return the number of good pairs.
//
//A pair (i, j) is called good if nums[i] == nums[j] and i < j.

package com.chahat;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] array= {1,2,3,1,1,3};
        int result =goodPairs(array);
        System.out.println(result);

    }

    static int goodPairs(int[] nums){
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i] == nums[j] && i<j){
                    count++;
                }
            }
        }
        return  count;
    }
}
