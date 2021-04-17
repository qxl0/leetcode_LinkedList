package com.qiang.leetcode;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] nums = new int[] {1,1,0,1,1,1};
		int[] nums = new int[] {1,0,1,1,0,1};
		
		int result = findMaxConsecutiveOnes(nums);
		
		System.out.println("result is: "+ result);
				
	}
	public static int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        
        int count = 0;
        int i = 0;
        while (i < nums.length){
            if (nums[i] == 1){
                count = getConsecutiveOnes(i, nums);
                if (result < count){
                    result = count;
                    i += count;
                } 
                else {
                	i++;
                }
            } else {
                i++;
            }    
        }
        return result;
    }
    private static int getConsecutiveOnes(int startIndex, int[] lst){
        int temp = startIndex;
        while (temp < lst.length && lst[temp] == 1){
            temp++;
        }
        return temp - startIndex;
    }
}
