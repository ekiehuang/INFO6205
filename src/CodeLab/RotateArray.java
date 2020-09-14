import java.util.Arrays;

public class RotateArray {
  public static void main(String[] args){
    int[] nums={1,2,3,4,5};
    int k=3;
    new RotateArray().rotate(nums,k);
    System.out.println(Arrays.toString(nums));
  }
  public void rotate(int[] nums, int k) {
   int n=nums.length;
   int[] result=new int[n];
   for(int i=0;i<k;i++){
     result[i]=nums[n-k+i];
   }
   for(int i=0;i<n-k;i++){
     result[i+k]=nums[i];
   }
    System.arraycopy(result, 0, nums, 0, n);
  }
}
