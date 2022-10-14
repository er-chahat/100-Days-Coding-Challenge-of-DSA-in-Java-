//There are n kids with candies. You are given an integer array candies,where each candies[i] represents
// the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.
//
//Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the
// extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.
//
//Note that multiple kids can have the greatest number of candies.

package com.chahat;

import java.util.ArrayList;

public class KidsWithCandies {
    public static void main(String[] args) {
        int[] candies ={12,1,12};
        int extraCandies=10;
        System.out.println( check(candies,extraCandies));

    }

    static ArrayList<Boolean> check(int[] candies, int extraCandies){
        int n=candies.length;
        int maxi =max(candies,n);
//        boolean[] result= new boolean[n];
        ArrayList<Boolean> result1=new ArrayList<>();
        for(int i=0;i<n;i++){
            int sum = candies[i] + extraCandies;


               if (sum >= candies[maxi]) {
//                   result[i] = true;
                   result1.add(true);
               } else {
                   result1.add(false);
                   //result[i] = false;
               }

            }
        return result1;
        }

        static int max(int[] arr,int n){
        int max=0;
        for(int i=0;i<n;i++){
            if(arr[max] < arr[i]){
                max=i;
            }

        }
        return max;
        }



}
