import java.util.Stack;

public class Calculator {
  public static void main(String[] args){
    String s="123";
    System.out.println(new Calculator().calculate(s));
  }
  public int calculate(String s) {
    if(s==null) return 0;
    int index=0;
    while(!Character.isDigit(s.charAt(index))){
      index++;
    }
    int sum=s.charAt(index)-'0';
    int a=0;
    int b=0;
    for(int i=index+1;i<s.length();i++){
      if(s.charAt(i)=='+'){
        while(!Character.isDigit(s.charAt(i))){
          i++;
        }
        a=s.charAt(i)-'0';
        while(i+1<s.length()&&Character.isDigit(s.charAt(i+1))){
          a=a*10+s.charAt(++i)-'0';
        }
        sum=sum+a;
      }else if(s.charAt(i)=='-'){
        while(!Character.isDigit(s.charAt(i))){
          i++;
        }
        b=s.charAt(i)-'0';
        while(i+1<s.length()&&Character.isDigit(s.charAt(i+1))){
        b=b*10+s.charAt(++i)-'0';
      }
        sum=sum-b;
      }
      else if(Character.isDigit(s.charAt(i))){
        sum=10*sum+s.charAt(i)-'0';
      }
    }
    return sum;
  }
}
