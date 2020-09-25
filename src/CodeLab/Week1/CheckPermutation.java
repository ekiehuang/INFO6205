import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
//LeetCode 242: Valid Anagram
public class CheckPermutation {

  public static void main(String[] args) {
    String s1 = "a";
    String s2 = "d";
    System.out.println(new CheckPermutation().checkPermutation(s1, s2));
  }

  public boolean checkPermutation(String s1, String s2) {
    //Approach 1: Sorting
    /*if (s1.length() != s2.length()) return false;
    char[] c1=s1.toCharArray();
    char[] c2=s2.toCharArray();
    Arrays.sort(c1);
    Arrays.sort(c2);
    return Arrays.equals(c1,c2);*/

    //Approach 2: HashTable
    if (s1.length() != s2.length()) return false;
    int[] count=new int[26];
    for(int i=0;i<s1.length();i++){
      count[s1.charAt(i)-'a']++;
      count[s2.charAt(i)-'a']--;
    }
    for(int i:count){
      if(i!=0) return false;
    }
    return true;
    //Approach 3: HashMap
    /*if (s1.length() != s2.length()) return false;
    HashMap<Character, Integer> map1 = new HashMap<>();
    HashMap<Character, Integer> map2 = new HashMap<>();
    for (int i = 0; i < s1.length(); i++) {
      map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0) + 1);
    }
    for (int i = 0; i < s2.length(); i++) {
      map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i), 0) + 1);
    }
    return map1.equals(map2);*/
  }
}
