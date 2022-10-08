//Given a zero-based permutation nums (0-indexed), build an array ans of the
// same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
//A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).

package com.chahat;
import java.util.*;

public class ArrayFromPermutation {

    public static void main(String[] args) {
	int[] nums = {4,5,0,2,3,1};
    int[] ans=new int[nums.length];


    for(int i=0;i<nums.length;i++){
        ans[i]= nums[nums[i]];
    }

        System.out.println(Arrays.toString(ans));
    }
}
