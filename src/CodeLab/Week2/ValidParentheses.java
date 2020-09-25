import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
  public static void main(String[] args){
    String s ="]";
    System.out.println(new ValidParentheses().isValid(s));
  }
  public boolean isValid(String s) {
    if(s==null) return false;
    HashMap<Character,Character> map=new HashMap<>();
    map.put(')','(');
    map.put(']','[');
    map.put('}','{');
    Stack<Character> stack=new Stack<>();
    for(int i=0;i<s.length();i++){
      if(map.containsKey(s.charAt(i))) {
        if(stack.isEmpty()||stack.pop()!=map.get(s.charAt(i))) return false;
      }
      else stack.push(s.charAt(i));
    }
    return stack.isEmpty();
  }
}
