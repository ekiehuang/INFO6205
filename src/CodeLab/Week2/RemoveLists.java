public class RemoveLists {
  public static void main(String[] args) {
    ListNode head = new ListNode(2);
    head.next = new ListNode(2);
    /*head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(2);
    head.next.next.next.next = new ListNode(5);
    head.next.next.next.next.next = new ListNode(6);
    head.next.next.next.next.next.next = new ListNode(7);*/
    ListNode result=new RemoveLists().removeElements(head,2);
    System.out.println(result);
  }
  public ListNode removeElements(ListNode head, int val) {
    ListNode dummy=new ListNode(0);
    dummy.next=head;
    ListNode pre=dummy;
    ListNode cur=pre.next;
    while(cur!=null){
      if(cur.val==val) pre.next=cur.next;
      else pre=pre.next;
      cur=cur.next;
    }
    return dummy.next;
  }
}
