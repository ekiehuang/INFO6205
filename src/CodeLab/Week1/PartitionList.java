public class PartitionList {
  public static void main(String[] args){
    ListNode head=new ListNode(1);
   /* head.next=new ListNode(3);
    head.next.next=new ListNode(7);
    head.next.next.next=new ListNode(4);
    head.next.next.next.next=new ListNode(2);*/
    System.out.println(new PartitionList().partition(head,4));
  }

  public ListNode partition(ListNode head, int x) {
    ListNode l1 = new ListNode();
    ListNode dummyHead1=l1;

    ListNode l2=new ListNode();
    ListNode dummyHead2=l2;

    ListNode cur=head;

    while(cur!=null){
      if(cur.val<x) {
        l1.next= new ListNode(cur.val);
        l1=l1.next;
      }
      else {
        l2.next= new ListNode(cur.val);
        l2=l2.next;
      }
      cur=cur.next;
    }
   l1.next=dummyHead2.next;
    return dummyHead1.next;
  }
}
