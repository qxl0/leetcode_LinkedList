
public class ListNode {
	int val;
	ListNode next;
	public ListNode(int val) {
		this.val = val;
		this.next = null;
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
