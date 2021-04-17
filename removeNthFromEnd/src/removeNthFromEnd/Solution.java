package removeNthFromEnd;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(-1);
		head.next = new ListNode(1); // new ListNode(2);
		head.next.next = new ListNode(2);
		
		//root.next.next = null;
//		root.next.next = new ListNode(3);
//		root.next.next.next = new ListNode(4);
//		root.next.next.next.next = new ListNode(5, null);
		
		System.out.println(removeNthFromEnd(head, 2));
	}

	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode slow=head,fast=head;
        
        for(int i=0;i<n;i++)
            fast=fast.next;
        
        if(fast==null)
            return head.next;
        
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        
        slow.next=slow.next.next;

        return head;
        
    }
}
