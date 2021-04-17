import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {-2147483648,1,1};
		System.out.println(thirdMax(nums));
	}
	
	public static int thirdMax(int[] nums) {
        Queue<Long> maxHeap = new PriorityQueue<>((a,b) -> {
        	if (b-a > 0)
        		return 1;
        	else if (b == a)
        		return 0;
        	else
        		return -1;
        });
        for (int n : nums){
        	if (!maxHeap.contains(Long.valueOf(n)))
        		maxHeap.add(Long.valueOf(n));
        }
        Long max = maxHeap.poll();
        int count = 2;
        Long result = (long) 0;
        while (count > 0 && !maxHeap.isEmpty()){
            result = maxHeap.poll();
            count--;
        }
        if (count == 0)
            return result.intValue();
        else
            return max.intValue();
    }

	
    
}
