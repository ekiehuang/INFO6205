import java.util.HashSet;

public class CheckPermutation {
  HashSet<String> set=new HashSet<>();
  public boolean checkPermutation(String s1, String s2){
    int from=0,to=s1.length()-1;
    permutation(s1,from,to);
    return set.contains(s2);
}

  private void permutation(String s1, int from, int to) {
  }
  }
