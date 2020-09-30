import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class MinStack{
  ArrayList<Integer> arr=new ArrayList<>();
  private Stack<Integer> minStack=new Stack<>();
  public static void main(String[] args){
    MinStack ms=new MinStack();
    ms.push(-2);
    ms.push(0);
    ms.push(-3);
    System.out.println(ms.getMin());
    //ms.push(1);
    ms.pop();
    System.out.println(ms.top());
    System.out.println(ms.getMin());

  }
  public MinStack() {
  }

  public void push(int x) {
    minStack.push(x);
    arr.add(x);
  }

  public void pop() {
    if(minStack.isEmpty()) return;
    arr.remove(minStack.size()-1);
    minStack.pop();


  }

  public int top() {
    return minStack.peek();
  }

  public int getMin() {
    if(arr.size()==0) return Integer.MIN_VALUE;
    int min=arr.get(0);
    for(Integer i:arr){
      if(i<min) min=i;
    }
    return min;
  }
}
