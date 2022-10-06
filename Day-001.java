package com.chahat;
import java.util.ArrayList;
public class Question23 {
    public static void main(String[] args) {
        int [][] matrix ={{7,8},{1,2}};
        System.out.println(luckyNum(matrix));
    }

    static ArrayList<Integer> luckyNum(int[][] matrix){
        ArrayList<Integer> list = new ArrayList<>();

        for (int i=0; i< matrix.length;i++){

            for (int j=0; j< matrix[0].length;j++){
                int min= min(matrix,i);
                if(matrix[i][j]==min){
                    int max= max(matrix,j);
                    if(matrix[i][j]==max){
                        list.add(matrix[i][j]);
                    }

                    else{
                        break;
                    }
                }

            }
        }
        return list;

    }

    static int min(int[][] arr,int i){
      int min=0;
            for (int j=0; j< arr[0].length;j++){
                if( j==0) {
                    min = arr[i][j];
                }
                if(arr[i][j]<min){
                    min=arr[i][j];
                }
            }

        return min;
    }

    static int max(int[][] arr,int m){
        int max=0;
            for (int j=0; j< arr.length;j++){
                if(arr[j][m]>max){
                    max=arr[j][m];
                }
            }

        return max;
    }
}
