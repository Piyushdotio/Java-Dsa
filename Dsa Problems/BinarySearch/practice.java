public class practice{
    public static int brute(int arr[],int k){
        int n=arr.length;
        int low=0;
        int mid=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]>k){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,3};
        int index=brute(arr,2);
        System.out.println(index);
    }
}