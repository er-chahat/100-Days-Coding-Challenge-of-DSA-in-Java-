//#leetcode
//Given an integer num, return the number of steps to reduce it to zero.
//In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.

package com.chahat;

public class CountStepsLeetCode {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }

    static int numberOfSteps(int num){
       return helper(num,0);
    }

    static int helper(int n,int c){
        if(n==0){
            return c;
        }

        if(n%2==0){
           return helper(n/2,c+1);
        }
        else{
          return   helper(n-1,c+1);
        }
    }
}
