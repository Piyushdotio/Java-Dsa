public class checkSubsequencesum {
    
    public static boolean checkSubsequenceSum(int[] nums, int k) {
          int index=0;
          int sum=0;
          boolean result=helper(nums,sum,index,k);
          return result;
    }
    public static boolean helper(int[] nums,int sum,int index,int k){
        if(index==nums.length){
            return sum==k;
        }
        //pick
        boolean pick=helper(nums, sum+nums[index], index+1, k);
        //  skip
        boolean skip=helper(nums, sum, index+1, k);

        return pick||skip;

    }

    public static void main(String[] args) {
        int arr[]={4, 3, 9, 2};
        boolean ans=checkSubsequenceSum(arr, 10);
        System.out.println(ans);;

    }
}
