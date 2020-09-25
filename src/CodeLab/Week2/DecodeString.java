import java.util.Stack;

public class DecodeString {
  public static void main(String[] args){
    String s="2[abc]3[cd]ef";
    System.out.println(new DecodeString().decodeString(s));
  }
  public String decodeString(String s) {
    Stack<Integer> num=new Stack<>();
    Stack<StringBuilder> str=new Stack<>();
    StringBuilder cur=new StringBuilder();
    for(int i=0;i<s.length();i++){
      if(Character.isDigit(s.charAt(i))){
        int time=s.charAt(i)-'0';
        while(Character.isDigit(s.charAt(++i))){
          time=time*10+s.charAt(i)-'0';
        }
        num.push(time);
      }
      if(s.charAt(i)=='[') {
        str.push(cur);
        cur=new StringBuilder();
      }
       else if(s.charAt(i)==']'){
        int loop=num.pop();
        StringBuilder sb=cur;
        cur=str.pop();
        while(loop>0){
          cur.append(sb);
          loop--;
        }
      } else cur.append(s.charAt(i));
    }
    return cur.toString();
  }
}
