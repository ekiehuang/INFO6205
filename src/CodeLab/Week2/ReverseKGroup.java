public class ReverseKGroup {
  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    head.next.next.next.next.next = new ListNode(6);
    head.next.next.next.next.next.next = new ListNode(7);
    ListNode result=new ReverseKGroup().reverseKGroup(head, 4);
    System.out.println(result);
  }

  public ListNode reverseKGroup(ListNode head, int k) {
    ListNode dummy=new ListNode(0);
    dummy.next=head;
    ListNode pre=dummy,end=dummy;
    while(end.next!=null){
      for(int i=0;i<k&&end!=null;i++){
        end=end.next;
      }
      if(end==null) break;
      ListNode nex=end.next;
      end.next=null;
      ListNode start=pre.next;
      pre.next=reverse(start);
      start.next=nex;
      pre=start;
      end=pre;
    }
    return dummy.next;
  }

  private ListNode reverse(ListNode start) {
    ListNode back=null,cur=start,front;
    while(cur!=null){
      front=cur.next;
      cur.next=back;
      back=cur;
      cur=front;
    }
    return back;
  }
}
