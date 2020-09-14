import java.util.HashSet;

public class IsUnique {
    public static void main(String[] args){
        System.out.println(new IsUnique().isUnique("abcd"));
    }
    public boolean isUnique(String s){
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))) return false;
            set.add(s.charAt(i));
        }
        return true;
    }
}
