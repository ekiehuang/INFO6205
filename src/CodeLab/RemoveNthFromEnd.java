public class RemoveNthFromEnd {
  public static void main(String[] args){
    ListNode head=new ListNode(1);
    //head.next=new ListNode(2);
   /* head.next.next=new ListNode(3);
    head.next.next.next=new ListNode(4);
    head.next.next.next.next=new ListNode(5);
    head.next.next.next.next.next=new ListNode(6);*/
    System.out.println(new RemoveNthFromEnd().removeNthFromEnd(head,1));
  }
  public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode dummy=new ListNode(0);
    dummy.next=head;
    int length=-1;
    ListNode front=dummy;
    ListNode back=dummy;
    while(front!=null){
      length++;
      front=front.next;
    }
    if(n>length) return head;
    front=dummy;
    while(front!=null&&n>=0){
      n--;
      front=front.next;
    }
    while(front!=null){
      front=front.next;
      back=back.next;
    }
    back.next=back.next.next;
    return dummy.next;
  }
}
