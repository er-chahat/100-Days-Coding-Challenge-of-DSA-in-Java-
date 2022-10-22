//Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
//
//Specifically, ans is the concatenation of two nums arrays.
//
//Return the array ans.
package com.chahat;
import java.util.*;

public class ConcatinationOfString {
    public static void main(String[] args) {
        int[] nums ={1,3,2,1};

        System.out.println(Arrays.toString(concatenate(nums)));
    }

    static int[] concatenate(int[] nums){
        int n=nums.length;
        int[] ans=new int[n+n];
        int k=0;
        for(int i=0;i<ans.length;i++){
            if(i<n){
                ans[i]=nums[i];
            }
            else {
                ans[i]=nums[k];
                k++;
            }
        }
        return ans;

    }
}
