
public class Solution {
	static ListNode temp;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean isPalindrome(ListNode head) {
		if (head == null || head.next == null) return true;
		
		// use two pointers: slow and fast to find the middle
        ListNode slow = head, fast = head;
        temp = head;
        while (fast.next != null) {
        	slow = slow.next;
        	fast = fast.next.next;
        }
        // if fast is already the lsat node
        // slow
        if (fast != null) {
        	// even nodes
        	slow = slow.next;
        }
        return traverse(slow);
    }
	public static boolean traverse(ListNode head) {
		if (head == null) return true;
		boolean res = traverse(head.next)&& (head.val == temp.val);
		temp = temp.next;
		return res;
	}
}
