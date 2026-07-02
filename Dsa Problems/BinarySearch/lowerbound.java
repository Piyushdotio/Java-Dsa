public class lowerbound {
    public static int brute(int arr[],int k){
        int n=arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i]>=k){
                return i;
            }
        }
        return n;
    }
    public static int optimal(int arr[],int k){// k is target
        int n=arr.length;
        int low=0;
        int ans=n;
        int mid=0;
        int high=n-1;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]>=k){
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
        int arr[]={3,5,8,15,19};
        int k= optimal(arr,9);
        System.out.println(k);
    }
}
