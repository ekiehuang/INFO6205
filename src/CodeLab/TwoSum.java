import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
  public static void main(String[] args) {
  int[] nums={4,5,7,10};
  int target=12;
  System.out.println(Arrays.toString(new TwoSum().twoSum(nums, target)));
  }
  public int[] twoSum(int[] nums,int target){
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<nums.length;i++){
      if(map.containsKey(target-nums[i])) return new int[]{map.get(target-nums[i]),i};
      map.put(nums[i],i);
      }
      return null;
    }
  }
