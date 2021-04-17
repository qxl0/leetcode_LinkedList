import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

			The number of elements initialized in nums1 and nums2 are m and n respectively. You may assume that 
			nums1 has a size equal to m + n such that it has enough space to hold additional elements from nums2.			
		 */
		int[] nums1 = new int[] {1,2,3,0,0,0};
		int[] nums2 = new int[] {2,5,6};
		merge(nums1, 3, nums2, 3);
		System.out.println(Arrays.toString(nums1));
		
		
	}
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = m - 1;
		int j = n - 1;
		int k = m + n - 1;
		
		while (i >= 0 && j >= 0) {
			if (nums1[i] > nums2[j]) {
				nums1[k] = nums1[i];
				i--;
				k--;
			} 
			else {
				nums1[k] = nums2[j];
				j--;
				k--;
			}
		}
		
		while (i >= 0) {
			nums1[k] = nums1[i];
			k--;i--;
		}
		
		while (j >= 0) {
			nums1[k] = nums2[j];
			k--;j--;
		}
	}
}
