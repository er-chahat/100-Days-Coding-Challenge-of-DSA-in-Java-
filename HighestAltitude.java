//There is a biker going on a road trip. The road trip consists of n + 1 points at different alt
// itudes. The biker starts his trip on point 0 with altitude equal 0.
//
//You are given an integer array gain of length n where gain[i] is the net gain in altitude between
// point i and i + 1 for all (0 <= i < n). Return the highest altitude of a point.

package com.chahat;

public class HighestAltitude {
    public static void main(String[] args) {
        int[] gain={-5,1,5,0,-7};
        System.out.println(alti(gain));

    }

    static int alti(int[] gain) {
        int max=0;
        int n = gain.length;
        int[] altitude = new int[n + 1];
//        altitude[0]=0;
        for (int i = 0; i < altitude.length; i++) {
            if (i == 0) {
                altitude[i] = 0;
            } else {
                altitude[i] =altitude[i-1]+gain[i-1];
            }
        }

        for (int i = 0; i < altitude.length;i++) {
            if (max < altitude[i]) {
                max =altitude[i];
            }
        }
        return max;


    }
}
