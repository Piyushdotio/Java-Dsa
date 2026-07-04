public class countoccurence {
    public static int lowerbound(int arr[],int k){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int mid=0;
        int ans=n;
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
    public static int upperbound(int arr[],int k){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int mid=0;
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
    
    public static int countoccurenceopt(int arr[],int k){
        int lower=lowerbound(arr, k);
        int upper=upperbound(arr, k);
        int count=0;
        for(int i = lower; i <upper; i++){
            count++;
        }
        return count;
    }
    
    public static void main(String[] args){
        int arr[]={0, 0, 1, 1, 1, 2, 3};
        int ans=countoccurenceopt(arr,1);
        System.out.println(ans);
    }
}
