package com.chahat;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,5};
        System.out.println(removeDuplicates(nums));
    }


        static int removeDuplicates(int[] nums) {
            int count=1;
            int k=1;

            for(int i=1;i<nums.length;i++){
                if(nums[i-1] != nums[i]){
                    nums[k]=nums[i];
                    k++;
                    count++;
                }
            }

            return count;

        }

}
