import java.util.Stack;

public class GetDecimalValue {
  public static void main(String[] args){
    ListNode head=new ListNode(1);
    head.next=new ListNode(1);
    head.next.next=new ListNode(0);
    System.out.println(new GetDecimalValue().getDecimalValue(head));
  }
  public int getDecimalValue(ListNode head) {
    if(head==null) return 0;
    int decimal=0;
    int times=0;
    Stack<Integer> stack=new Stack<>();
    while(head!=null){
      stack.push(head.val);
      head=head.next;
    }
    while(!stack.isEmpty()){
      decimal= (int) (decimal+stack.pop()*Math.pow(2,times++));
    }
    return decimal;
  }
}
