package reverseList;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3, null);
		System.out.println(reverseList(head));
	}
	public static ListNode reverseList(ListNode head) {
		ListNode prev = null;
		ListNode current = head;
		ListNode next = null;
		
		while (current != null ) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
		return head;
	}

}
