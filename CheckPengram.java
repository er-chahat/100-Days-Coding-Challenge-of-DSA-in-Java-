//A pangram is a sentence where every letter of the English alphabet appears at least once.
//
//Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
package com.chahat;

import java.util.Arrays;

public class CheckPengram {
    public static void main(String[] args) {
            int[] nums ={0,1,2,3,4};
            int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums,index)));
    }

    static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        for(int i=0; i<nums.length;i++){
            solve(target,nums[i],index[i]);
        }
        return target;
    }

    static void solve(int[] target , int nums, int index){
        for(int i=target.length-1; i>index;i--){
            swap(target,i,i-1);
        }
        target[index]=nums;
    }

    static void swap(int[] target,int first , int second){
        int temp =  target[first];
        target[first] = target[second];
        target[second] = temp;
    }


}
