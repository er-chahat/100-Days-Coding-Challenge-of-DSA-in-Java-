//Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//
//Return the running sum of nums.

package com.chahat;
import java.util.*;

public class QuestionLeetCode {
    public static void main(String[] args) {
        //int[] nums = {1,2,3,4};
        int[] nums={3,1,2,10,1};
        int[] runingSum =new int[nums.length];

        for(int i=0;i<nums.length;i++){
            if(i==0){
                runingSum[i] =nums[i];
            }
            else{
                runingSum[i] = nums[i]+runingSum[i-1];
            }

        }
        System.out.println(Arrays.toString(runingSum));
    }
}
