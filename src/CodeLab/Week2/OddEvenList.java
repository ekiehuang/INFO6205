public class OddEvenList {
    public static void main(String[] args){
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        new OddEvenList().oddEvenList(head);
    }
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null||head.next.next==null) return head;
        ListNode even=head.next,odd=head,evenHead=even;
        while(even!=null&&even.next!=null){
            odd.next=even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
        }
        odd.next=evenHead;
        return head;
    }
}
