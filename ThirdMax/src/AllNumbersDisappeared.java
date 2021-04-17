import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AllNumbersDisappeared {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {4,3,2,7,8,2,3,1};
		System.out.println(Arrays.toString(FindAllNumbersDisappeared(nums)));
	}
	
	public static int[] FindAllNumbersDisappeared(int[] nums) {
		Map<Integer,Integer> map = new HashMap<>();
		
		for (int i=0;i<nums.length;i++) {
			map.putIfAbsent(nums[i], i);
		}
		map.forEach((key, value) -> System.out.println(key + ":" + value));
		ArrayList<Integer> ans = new ArrayList<>();
		for (int i=1;i<=nums.length;i++) {
			if (!map.containsKey(i))
				ans.add(i);
		}
		return ans.stream().mapToInt(Integer::valueOf).toArray();
	}
}	
