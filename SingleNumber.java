//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//
//You must implement a solution with a linear runtime complexity and use only constant extra space.
package com.chahat;
public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,2,1,6,3,6,4};
        System.out.println(ans(arr));
    }

    static int ans(int[] arr){
        int unique=0;
        for(int n:arr){
            unique ^=n;
        }
        return unique;
    }
}
