

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {-1222222,1,1};
		System.out.println(thirdMax(nums));
	}
	
    public static int thirdMax(int[] nums) {
         
        Set<Integer> set =  Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int[] result = set.stream().mapToInt(Integer::intValue).toArray();
        
        System.out.println(Arrays.toString(result));
        Arrays.sort(result);
        
        if(result.length<3) 
            return result[result.length-1];
        return result[result.length-3];
        
    }
	
}
