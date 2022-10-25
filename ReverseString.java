//Write a function that reverses a string. The input string is given as an array of characters s.
//
//You must do this by modifying the input array in-place with O(1) extra memory.
//
// 
import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] s= {'H','a','n','n','a','h'};
        reverseString(s);
        System.out.println(Arrays.toString(s));

    }

    public static void reverseString(char[] s) {
        int l = s.length;
       helping(s,0,l-1);

    }

    static void helping(char[] s,int st,int e){

        if(st>=e){
            return ;
        }

            char temp = s[st];
            s[st] = s[e];
            s[e] = temp;

            helping(s, st+1, e-1);
    }
}
