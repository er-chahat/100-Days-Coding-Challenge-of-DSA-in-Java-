//A pangram is a sentence where every letter of the English alphabet appears at least once.
//
//Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

package com.chahat;

public class QuestionNo10 {
    public static void main(String[] args) {
        String sentence ="abcdefghijklmnopqrstuvw";

        check(sentence);
//        System.out.println(pangram(sentence));

    }

static boolean check(String sentence){

    for(int i=97;i<=122;i++){
        int count=0;
        for(int j=0;j<sentence.length();j++){
            if(i == sentence.charAt(j)){
                count++;
                break;
            }
        }
        if(count==0){
            return false;
        }
    }
    return true;
}

//    static boolean pangram(String sentence){
//        int count =0;
//        for(int i=0;i<sentence.length()-1;i++){
//                if (sentence.charAt(i) == sentence.charAt(i + 1)) {
//                    count++;
//                }
//        }
//        if(count==0 && sentence.length()!=1){
//            return true;
//        }
//        return false;
//
//    }

}
