import java.util.Arrays;

public class RotateArray {
  public static void main(String[] args){
    int[] nums={1,2,3,4,5};
    int k=3;
    new RotateArray().rotate(nums,k);
    System.out.println(Arrays.toString(nums));
  }
  public void rotate(int[] nums, int k) {
    if(nums.length==1) return;
    int n=nums.length;
    int time=k%n;
    int[] result=new int[n];
    for(int i=0;i<time;i++){
      result[i]=nums[n-time+i];
    }
    for(int i=0;i<n-time;i++){
      result[i+time]=nums[i];
    }
    System.arraycopy(result, 0, nums, 0, n);
  }
}
