public class Insert {
  public Node insert(Node head, int insertVal) {
    Node r = new Node(insertVal,null);

    if(head == null){
      r.next = r;
      return r;
    }

    Node n = head;
    while(true){
      if((insertVal >= n.val && insertVal <= n.next.val)
              || (n.next.val < n.val && (insertVal >= n.val || insertVal <= n.next.val))
              || n.next == head){
        r.next = n.next;
        n.next = r;
        break;
      }
      n = n.next;
    }

    return head;
  }
}
