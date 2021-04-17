package copyRandomList;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(1);
		head.next = new Node(2);
		head.random = head.next;
		head.next.random = head;
		System.out.println("before: " + head.toString());
		Node newHead = copyRandomList(head);
		System.out.println("after: " + newHead.toString());
	}
	public static Node copyRandomList(Node head) {
		if (head == null) return null;
		Map<Node, Node> oldToNew = new HashMap<>();
		
		// create a head for the new
		Node newHead = copyNode(oldToNew, head);
		Node newPrev = newHead;
		Node current = head.next;
		while (current != null) {
			Node newNode = copyNode(oldToNew, current);
			newPrev.next = newNode;
			newPrev = newPrev.next;
			current = current.next;
		}
		return newHead;
	}
	private static Node copyNode(Map<Node, Node> oldToNew, Node node) {
		Node newNode = oldToNew.computeIfAbsent(node, key -> new Node(key.val));
		if (node.random != null) {
			// copy random node
			Node newRandom = oldToNew.computeIfAbsent(node.random, key -> new Node(key.val));
			newNode.random = newRandom;
		}
		return newNode;
	}

}
