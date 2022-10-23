
//We are playing the Guess Game. The game is as follows:
//
//I pick a number from 1 to n. You have to guess which number I picked.
//
//Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.
//
//You call a pre-defined API int guess(int num), which returns three possible results:
//
//-1: Your guess is higher than the number I picked (i.e. num > pick).
//1: Your guess is lower than the number I picked (i.e. num < pick).
//0: your guess is equal to the number I picked (i.e. num == pick).
//Return the number that I picked.
package com.chahat;

public class GuessNumber {
    public static void main(String[] args) {
    int n=10;
        System.out.println(guessNumber(n));
    }

    ///**
    // * Forward declaration of guess API.
    // * @param  num   your guess
    // * @return 	     -1 if num is higher than the picked number
    // *			      1 if num is lower than the picked number
    // *               otherwise return 0
    // * int guess(int num);
    // */
    static int guess(int num){ //API
        int pick=6;

        if(num == pick){
            return 0;
        }
        if(num > pick){
            return -1;
        }

        return 1;
    }

    public static int guessNumber(int n) {
        int s=1;
        int e=n;
        while(s<=e){
            int mid=s+(e-s)/2;
            int ans=guess(mid);
            if(ans==0){
                return mid;
            }
            if(ans==-1){
                e=mid-1;
            }
            if(ans==1){
                s=mid+1;
            }
        }
        return -1;

    }
}
