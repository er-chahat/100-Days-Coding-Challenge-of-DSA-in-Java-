//Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
//
//You must do it in place.

package com.chahat;

import java.util.Arrays;

public class SetMterixToZero {
    public static void main(String[] args) {
    int[][] matrix ={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
    setZeroes(matrix);
    System.out.println(Arrays.deepToString(matrix));
    }
//    //BruteForce solution
//    public static void setZeroes(int[][] matrix) {
//                int n=matrix.length;
//                int m =matrix[0].length;
//
//                int l=0;
//                int i=0;
//
//                while(i<n){
//                    int j=0;
//                    while(j<m){
//                        if(matrix[i][j]==0){
//                            int k=0;
//                            while(k<n || k<m){
//                                if(k<m && matrix[i][k]!=0){
//                                    matrix[i][k]=-1;
//                                }
//                                if(k<n && matrix[k][j]!=0){
//                                    matrix[k][j]=-1;
//                                }
//
//                                k++;
//                            }
//                            j++;
//                        }
//                        else{
//
//                            j++;
//                        }
//
//                    }
//                    i++;
//
//                }
//
//
//                while(l<n){
//                    int p=0;
//                    while(p<m){
//                        if(matrix[l][p]==-1){
//                            matrix[l][p]=0;
//                            p++;
//                        }
//                        else{
//                            p++;
//                        }
//                    }
//                    l++;
//                }
//
//            }

    // optimized solution
    public static void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[] row = new int[n];
        int[] col = new int[m];

        for (int l = 0; l < n; l++) {
            for (int j = 0; j < m; j++) {
                if (matrix[l][j] == 0) {
                    row[l] = -1;
                    col[j] = -1;
                }

            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] == -1 || col[j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }


    }
    }




