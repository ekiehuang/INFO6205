public class DeleteDuplicates {
  public static void main(String[] args){
    ListNode head=new ListNode(1);
    head.next=new ListNode(1);
    head.next.next=new ListNode(3);
    head.next.next.next=new ListNode(3);
    head.next.next.next.next=new ListNode(4);
    System.out.println(new DeleteDuplicates().deleteDuplicates(head));
  }
  public ListNode deleteDuplicates(ListNode head) {
    if(head==null||head.next==null) return head;
    ListNode current=head;
    while(current.next != null){
      if(current.val==current.next.val) {
        current.next=current.next.next;
      }
      else current=current.next;
    }
    return head;
  }
}
