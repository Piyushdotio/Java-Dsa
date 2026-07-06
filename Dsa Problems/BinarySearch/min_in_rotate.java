public class min_in_rotate {
    public static int optimal(int arr[]){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int mid=0;
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[low]<=arr[mid]){
                ans=Math.min(ans, arr[low]);
                low=mid+1;
            }else{
                ans=Math.min(ans,arr[mid]);
                high=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={3,4,5,1,2};
        int ans=optimal(arr);
        System.out.println(ans);
    }
}
