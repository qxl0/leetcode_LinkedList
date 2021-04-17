package com.qiang.leetcode;

public class EvenNumberCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var nums = new int[] { 555, 22, 499, 9};
		System.out.println("the number of even number in the array is: " + findNumbers(nums));
		
	}
	
	public static int findNumbers(int[] nums) {
        int res = 0;
        for (int i=0;i<nums.length;i++){
            if (isEvenDigits(nums[i]))
                res++;
        }
        return res;
    }
    private static boolean isEvenDigits(int num){
        int count = 1;
        while (num / 10 > 0){
            count++;
            num = num/10;
        }
        return count % 2 == 0;
    }

}
