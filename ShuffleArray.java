//Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
//
//Return the array in the form [x1,y1,x2,y2,...,xn,yn].
package com.chahat;
import java.util.*;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr ={2,5,1,3,4,7};
        int n=3;
        //System.out.println(Arrays.toString(shuffle(arr,n)));
       int a[]=shuffle(arr,n);
        System.out.println(Arrays.toString(a));


    }

    static int[] shuffle(int[] nums,int n) {
        int[] arr =new int[2*n];
        int k=0;
        for (int i=0;i<n;i++){
            arr[k] =nums[i];
            arr[k+1]=nums[n+i];
            k+=2;
        }


        return arr;
    }

    }


