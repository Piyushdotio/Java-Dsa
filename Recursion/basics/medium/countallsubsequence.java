public class countallsubsequence {
    public static int countSubsequenceWithTargetSum(int[] nums, int k){
            int index=0;
            int sum=0;
            int result=helper(nums,k,index,sum);
            return result;
    }
    public static int helper(int arr[],int k,int index,int sum){
        if(index==arr.length){
            return sum==k?1:0;
        }
        int pick=helper(arr, k, index+1, sum+arr[index]);
        int skip=helper(arr, k, index+1, sum);
        return pick+skip;
    }
    public static void main(String[] args){
        int arr[]={4, 2, 10, 5, 1, 3};
        int ans=countSubsequenceWithTargetSum(arr, 5);
        System.out.println(ans);
    }
}
