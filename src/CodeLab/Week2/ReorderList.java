public class ReorderList {
  public static void main(String[] args){
    ListNode head=new ListNode(1);
    head.next=new ListNode(2);
    head.next.next=new ListNode(3);
    head.next.next.next=new ListNode(4);
    head.next.next.next.next=new ListNode(5);
    head.next.next.next.next.next=new ListNode(6);
    head.next.next.next.next.next.next=new ListNode(7);
    new ReorderList().reorderList(head);
  }
  public void reorderList(ListNode head) {
    if(head==null||head.next==null||head.next.next==null) return;
    ListNode front=head,back=head;
    //divide into two parts
    while(front!=null&&front.next!=null){
      front=front.next.next;
      back=back.next;
    }
    ListNode second=back.next;
    back.next=null;
    //reverse the second part
    ListNode cur=second,b=null,f;
    while(cur!=null){
      f=cur.next;
      cur.next=b;
      b=cur;
      cur=f;
    }

    /*ListNode f=second.next,cur=second,b=null;
    while(f!=null){
      cur.next=b;
      b=cur;
      cur=f;
      f=f.next;
    }
    cur.next=b;*/
    //insert
    ListNode dummy=head;
    while(b!=null){
      ListNode temp=dummy.next;
      dummy.next=b;
      dummy=temp;

      temp=b.next;
      b.next=dummy;
      b=temp;

      /*ListNode temp=new ListNode(b.val);
      temp.next=dummy.next;
      dummy.next=temp;
      b=b.next;
      dummy=dummy.next.next;*/
    }
  }
}
