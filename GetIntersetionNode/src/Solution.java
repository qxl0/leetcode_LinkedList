
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode listA = new ListNode(1);
		listA.next = new ListNode(9);
		listA.next.next = new ListNode(1);
		listA.next.next.next = new ListNode(2);
		listA.next.next.next.next = new ListNode(4);
		
		ListNode listB = new ListNode(3);
		listB.next = listA.next.next.next;
		
		System.out.println("Intersect ast " + getIntersectionNode(listA, listB));
		
	}

	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA,temp2=headB;
        int count = 1;
        while(temp1!=null||temp2!=null){
            if(temp1==temp2){
                return temp1;
            }
            temp1=temp1==null?headB:temp1.next;
            temp2=temp2==null?headA:temp2.next;
            System.out.println(String.format("%s:%s----%s", count++, temp1, temp2));
        }
        return null;
    }
}
