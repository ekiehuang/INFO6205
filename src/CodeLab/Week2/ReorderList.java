public class ReorderList {
  public static void main(String[] args){
    ListNode head=new ListNode(1);
    head.next=new ListNode(2);
    head.next.next=new ListNode(3);
    head.next.next.next=new ListNode(4);
    head.next.next.next.next=new ListNode(5);
    new ReorderList().reorderList(head);
  }
  public void reorderList(ListNode head) {
    if(head==null||head.next==null) return;
    ListNode front=head,back=head;
    while(front!=null){
      front=front.next;
      if(front!=null){
        back=back.next;
        front=front.next;
      }
    }
    ListNode second=back.next;
    back.next=null;
    //reverse the second part
    ListNode f=second.next,cur=second,b=null;
    while(f.next!=null){
      cur.next=b;
      b=cur;
      cur=f;
      f=f.next;
    }
    f.next=cur;

  }
}
