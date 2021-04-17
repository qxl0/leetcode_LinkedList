
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. ListNode root = new ListNode(3);
//		root.next = new ListNode(2);
//		ListNode cycle = root.next;
//		root.next.next = new ListNode(0);
//		root.next.next.next = new ListNode(-4);
//		root.next.next.next.next = cycle;
//		2. root.next = new ListNode(4);
//		root.next.next = null;
//		System.out.println("2. Has cycle: " + hasCycle(root));
		
		// 3. 
//		ListNode root = new ListNode(3);
//		root.next = new ListNode(4);
//		root.next.next = null;
//		System.out.println("3. Has cycle should be false: " + hasCycle(root));
		
		// 4. 
//		ListNode root = new ListNode(3);
//		root.next = new ListNode(2);
//		root.next.next = new ListNode(0);
//		root.next.next.next = new ListNode(-4);
//		root.next.next.next.next = root.next; 
//		System.out.println("4. Has cycle should be true: " + hasCycle(root));
		
		
		// 4. 
//		ListNode root = new ListNode(3);
//		root.next = new ListNode(2);
//		root.next.next = new ListNode(0);
//		root.next.next.next = new ListNode(-4);
//		root.next.next.next.next = root.next; 
//		System.out.println("4. Has cycle should be 1: " + detectCycle(root).val);
				
		// 5
		ListNode root = new ListNode(1);
		root.next = new ListNode(2);
		root.next.next = null; 
		ListNode n = detectCycle(root);
		System.out.println("4. Has cycle should be 1: " + n);
		
	}
	
	
	public static boolean hasCycle(ListNode head) {
		if (head == null || head.next == null)
            return false;
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
        	slow = slow.next;
        	fast = fast.next.next;
        	if (slow == fast)
        		return true;
        }
        return false;
    }
	
	
	public static ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null)
            return null;
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
        	slow = slow.next;
        	fast = fast.next.next;
        	if (slow == fast)
        		break;
        }
        
        if (fast == null || fast.next == null)
        	return null;
        slow = head;
        while (true) {
        	if (fast == slow)
        		return fast;
        	fast = fast.next;
        	slow = slow.next;
        }
    }

}
