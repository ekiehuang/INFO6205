import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class MinStack{
  //Approach 1: Two stacks
  private Stack<Integer> stack=new Stack<>();
  private Stack<Integer> minStack=new Stack<>();
  //Approach 2: less efficient
 /* private ArrayList<Integer> arr=new ArrayList<>();
  private Stack<Integer> minStack=new Stack<>();*/
  public static void main(String[] args){
    MinStack ms=new MinStack();
    ms.push(0);
    ms.push(1);
    ms.push(0);
    System.out.println(ms.getMin());
    //ms.push(1);
    ms.pop();
    System.out.println(ms.top());
    System.out.println(ms.getMin());

  }
  public MinStack() {
  }

  public void push(int x) {
    //Approach 1:
    stack.push(x);
    if(minStack.isEmpty()||x<=minStack.peek()) minStack.push(x);

    //Approach 2
    /*minStack.push(x);
    arr.add(x);*/
  }

  public void pop() {
    //Approach 1:
    if(stack.isEmpty()) return;
    int p=stack.pop();
    if(p==minStack.peek()) minStack.pop();

    //Approach 2:
    /*if(minStack.isEmpty()) return;
    arr.remove(minStack.size()-1);
    minStack.pop();*/


  }

  public int top() {
    //Approach 1:
    return stack.peek();

    //Approach 2:
    //return minStack.peek();
  }

  public int getMin() {
    //Approach 1:
    return minStack.peek();

    //Approach 2:
    /*if(arr.size()==0) return Integer.MIN_VALUE;
    int min=arr.get(0);
    for(Integer i:arr){
      if(i<min) min=i;
    }
    return min;*/
  }
}
