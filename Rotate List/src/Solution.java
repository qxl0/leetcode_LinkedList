
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		System.out.println("before: " + head.toString());
		//ListNode newHead = reverseList(head);
		ListNode newNode = rotateRight(head, 2);
		System.out.println("rotate: "+ newNode.toString());
	}
	public static ListNode rotateRight(ListNode head, int k) {
		ListNode startNode = findStartNode(head, k);
		
		// if startNode.next is null, means nothing to rotate
		if (startNode == null || startNode.next == null)
			return head;
		// startNode is the null tail
		ListNode reversed = startNode.next; //reverseList(startNode.next);
		startNode.next = null;
		// find tail of reversed
		ListNode tail = findTail(reversed);
		if (tail != null)
			tail.next = head;
		return reversed;
	}
	
	public static ListNode reverseList(ListNode head) {
		if (head == null || head.next == null) return head;
		
		ListNode prev = null;
		ListNode curr = head;
		ListNode next = head.next;
		while (curr != null) {
			curr.next = prev;
			prev = curr;
			curr = next;
			if (next != null) {
				next = next.next;
			}
		}
		return prev;
	}
	public static ListNode findTail(ListNode head) {
		if (head == null) return null;
		
		while (head.next != null) {
			head = head.next;
		}
		return head;
	}
	
	public static ListNode findStartNode(ListNode node, int k) {
		int length = findLength(node);
		int newK = k % length;
		ListNode slow = node, fast = node;
		while (fast != null && newK-- > 0) {
			fast = fast.next;
		}
		if (newK > 0) // k is too large
			return null;
		
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
	}
	public static int findLength(ListNode head) {
		int result = 0;
		while (head != null) {
			result++;
			head = head.next;
		}
		return result;
	}
}
