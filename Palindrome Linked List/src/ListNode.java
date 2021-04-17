

public class ListNode {
	int val;
	ListNode next;
	public ListNode(int val) {
		this.val = val;
	}
	public ListNode(int val, ListNode n) {
		this.val = val;
		this.next = n;
	}
	public String toString() {
		String result = val + "->";
		if (next != null) {
			result += next.toString();
		}
		else {
			result += "null";
		}
		return result;
	}
}
