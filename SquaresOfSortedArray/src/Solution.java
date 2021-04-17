import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {-4,-1,0,3,10};
		System.out.println("Sorted Square array output is: " + Arrays.toString(sortedSquares(nums)));
	}
	
	public static int[] sortedSquares(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            result.add(nums[i]*nums[i]);
        }
        
        Collections.sort(result);
        int[] primitive = result.stream()
                            .mapToInt(Integer::intValue)
                            .toArray();
        return primitive;        
    }

}
