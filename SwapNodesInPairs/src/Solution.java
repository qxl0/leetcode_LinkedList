
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = null;
		
		System.out.println("Before swap: " + head.toString());
		ListNode result = swapPairs(head);
		
		System.out.println("After swap: " + result.toString());
	}
	public static ListNode swapPairs(ListNode head) {
		
		if (head != null && head.next != null) {

			//swap first 2 nodes
			ListNode n1 = head;
			ListNode n2 = n1.next;

			head = n2;
			n1.next = n2.next;
			n2.next = n1;                   
			ListNode pred = n1;

			//swap remainder
			while (pred.next != null && pred.next.next != null) {
				n1 = pred.next;
				n2 = n1.next;

				pred.next = n2;
				n1.next = n2.next;
				n2.next = n1;                   
				pred = n1;
			}
		}
		return head;
	}
}
