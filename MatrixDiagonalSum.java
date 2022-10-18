//Given a square matrix mat, return the sum of the matrix diagonals.
//
//Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal
// that are not part of the primary diagonal.

package com.chahat;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] arr ={{1,2,3},
                {4,5,6},
                {7,8,9}};
        System.out.println(diagonalSum(arr));
    }


    public static int diagonalSum(int[][] mat) {
        int sum=0;
        int i=0,n=mat.length-1;
        int j=n;
        while(i<=n && j>=0){
            sum+=mat[i][i];
            if(i==j){
                j--;
                i++;
            }
            else {
                sum += mat[i][j];
                i++;
                j--;
            }
        }

        return sum;

    }
}
