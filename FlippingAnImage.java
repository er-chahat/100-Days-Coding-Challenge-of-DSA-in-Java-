//Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
//
//To flip an image horizontally means that each row of the image is reversed.
//
//For example, flipping [1,1,0] horizontally results in [0,1,1].
//To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
//
//For example, inverting [0,1,1] results in [1,0,0].

package com.chahat;

import java.util.Arrays;

public class Question13 {
    public static void main(String[] args) {
        int[][] image={{0,1,1},{1,0,0},{1,1,0}};
        System.out.println(Arrays.deepToString(flippind(image)));

    }

    static int[][] flippind(int[][] image){
        int n=image.length;
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            int k=1;
            for(int j=0;j<n;j++){
                arr[i][j]=image[i][n-k];
                k++;
                if(arr[i][j]==1){
                    arr[i][j]=0;
                }
                else{
                    arr[i][j]=1;
                }
            }
        }
       return arr;
    }
}
