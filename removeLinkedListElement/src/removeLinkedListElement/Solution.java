package removeLinkedListElement;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = null;
		System.out.println(removeElements(head, 2));
	}

	public static ListNode removeElements(ListNode head, int val) {
			ListNode dummy = new ListNode(0);
			dummy.next = head;
			ListNode current = head;
			ListNode prev = dummy, next = null;
			while (current != null){
				next = current.next;
				if (current.val == val){
					// remove
					prev.next = next;
					current = next;
				}
				else {
					prev = current;
					current = next;                
				}
			}
			return dummy.next;
		}
}
