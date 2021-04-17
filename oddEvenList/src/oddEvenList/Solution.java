package oddEvenList;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4, null);
		System.out.println("Input: "+ head);
		System.out.println("Output: " + oddEvenList(head));
	}
	public static ListNode oddEvenList(ListNode head) {
		if (head == null || head.next == null) return head;
		
		ListNode odd = head;
		ListNode even = head.next;
		ListNode saveEven = even;
		
		while (even != null && even.next != null) {
			ListNode nextOdd = even.next;
			
			// change links
			odd.next = nextOdd;
			even.next = nextOdd.next;
			
			// move 
			odd = nextOdd;
			even = nextOdd.next;
		}
		
		odd.next = saveEven;
		return head;
	}

}
