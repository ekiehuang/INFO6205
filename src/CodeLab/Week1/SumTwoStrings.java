public class SumTwoStrings {
  public static void main(String[] args){
    String s1="245";
    String s2="897";
    System.out.println(new SumTwoStrings().sumTwoStrings(s1,s2));
  }
  public String sumTwoStrings(String s1, String s2) {
    if(s1==null) return s2;
    if(s2==null) return s1;
    int add = 0;
    StringBuilder sum = new StringBuilder();
    int l1 = s1.length() - 1, l2 = s2.length() - 1;
    while (l1 >= 0 || l2 >= 0) {
      int x = (l1 < 0) ? 0 : (s1.charAt(l1) - '0');
      int y = (l2 < 0) ? 0 : (s2.charAt(l2) - '0');
      sum.append((x + y + add) % 10);
      add = (x + y + add) / 10;
      l1--;
      l2--;
    }
    if(add!=0) sum.append(add);
    return sum.reverse().toString();
  }
}
