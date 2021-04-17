package copyRandomList;

public class Node {
	int val;
	Node next;
	Node random;
	public Node(int v) {
		this.val = v;
		this.next = null;
		this.random = null;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(",(");
		sb.append(val);
		sb.append(",");
		if (random != null) {
			sb.append(random.val);
		}else {
			sb.append(" ");
		}
		sb.append(")");
		if (this.next != null)
			sb.append(this.next.toString());
		else
			sb.append(",null");
		return sb.toString();
	}
}
