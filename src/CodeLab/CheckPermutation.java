import java.util.HashSet;

public class CheckPermutation {
  HashSet<String> set=new HashSet<>();

  public static void main(String[] args){
    String s1="adcd";
    String s2="ddca";
    System.out.println(new CheckPermutation().checkPermutation(s1,s2));
  }
  public boolean checkPermutation(String s1, String s2){
    int from=0,to=s1.length();
    char[] chars=s1.toCharArray();
    permutation(chars,from,to);
    return set.contains(s2);
}

  private void permutation(char[] chars, int from, int to) {
    if(from==to) set.add(new String(chars));
    else {
      for(int i=from;i<to;i++) {
        swap(chars, from, i);
        permutation(chars, from + 1, to);
        swap(chars, from, i);
      }
    }
  }

  private void swap(char[] chars, int from, int pos) {
    char temp=chars[from];
    chars[from]=chars[pos];
    chars[pos]=temp;
  }
}
