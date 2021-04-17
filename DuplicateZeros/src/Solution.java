import java.util.Arrays;
import java.util.DuplicateFormatFlagsException;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Input: [1,0,2,3,0,4,5,0]
			Output: null
			Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
		 */
		int[] arr = new int[] { 1,0,2,3,0,4,5,0};
		duplicateZeros(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static int[] duplicateZeros(int[] arr) {
        int[] result = new int[arr.length];
        int i = 0;
        int j = 0;
        while (i < arr.length && j < arr.length){
            if (arr[i] != 0) {
                result[j] = arr[i];
                i++;
                j++;
            }
            else{
                while (arr[i] == 0 && j < arr.length){
                    // insert 2 0 for each 
                    result[j] = 0;
                    if (j + 1 < arr.length)
                        result[j+1] = 0;
                    i++;
                    j += 2;
                }
            }
        }
        arr = Arrays.copyOf(result,arr.length);
        return arr;
    }

}
