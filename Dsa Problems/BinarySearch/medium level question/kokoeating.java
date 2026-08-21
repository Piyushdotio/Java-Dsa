public class kokoeating {
    public static long finalhour(int arr[],int k){
        long totalhour=0;
        for(int num:arr){
            totalhour+=(long)Math.ceil((double)num/k);
        }
        return totalhour;
    }
 
    public static int greater(int arr[]){
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            ans=Math.max(ans,arr[i]);
        }
        return ans;
    }
    public static int brute(int[]arr,int h){
        int n=arr.length;
        int ans=Integer.MAX_VALUE;
        int high=greater(arr);
        for(int i=1;i<=high;i++){
            long totalhours=finalhour(arr,i);
            if(totalhours<=h){
                return i;
            }
        }
        return -1;
    }
    public static int optimal(int arr[],int h){
        int low=1;
        int mid=0;
        int high=greater(arr);
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            mid=(low+high)/2;
            long totalhours=finalhour(arr, mid);
            if(totalhours<=h){
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
        int arr[]={3,6,7,11};
        int ans=brute(arr, 8);
        int ans2=optimal(arr, 8);
        System.out.println(ans);
        System.out.println(ans2);
    }
}
