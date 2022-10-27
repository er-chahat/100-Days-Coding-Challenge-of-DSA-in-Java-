
///Given a square matrix mat, return the sum of the matrix diagonals.
//
//Only include the sum of all the elements on the primary diagonal and all the elements on
// the secondary diagonal that are not part of the primary diagonal.
package com.chahat;

public class DiagonalSum {

    public static void main(String[] args) {
        int[][] mat={{5}};

        System.out.println(dianol(mat));
    }

    static int dianol(int[][] mat){
        int sum=0;
        int n=mat.length-1;
        for (int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(i==j || j==n-i){
                   sum+=mat[i][j];

                }


            }
        }
        return sum;
    }
}
