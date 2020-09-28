public class SwapNodes {
  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    head.next.next.next.next.next = new ListNode(6);
    head.next.next.next.next.next.next = new ListNode(7);
    ListNode result=new SwapNodes().swapPairs(head);
    System.out.println(result);
  }
  public ListNode swapPairs(ListNode head) {
    ListNode dummy=new ListNode(0);
    dummy.next=head;
    ListNode back=dummy,cur=dummy.next,front;
    while(cur!=null&&cur.next != null){
      front=cur.next;
      ListNode nex=front.next;
      front.next=cur;
      back.next=front;
      cur.next=nex;
      back=cur;
      cur=cur.next;
    }
    return dummy.next;
  }
}
