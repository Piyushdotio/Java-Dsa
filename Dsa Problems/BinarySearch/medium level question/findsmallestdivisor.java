import java.util.*;
public class findsmallestdivisor{
    public static int greater(int arr[]){
        int n=arr.length;
        int ans=Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            ans=Math.max(ans,arr[i]);
        }
        return ans;
    }
    
    //ceil formula for 2 loop (a+b-1)/b
   public static int brute(int arr[],int threshold){
    int max=greater(arr);
    for(int divisor = 1; divisor <=max; divisor++){
        int sum=0;
        for(int i = 0; i <arr.length; i++){
            sum+=(arr[i]+divisor-1)/divisor;
        }
        if(sum<=threshold){
            return divisor;
        }
    }
    return -1;
   }
    //int mid = low + (high - low) / 2; for bigger number
   
   public static int  divide(int arr[],int mid){
        int n=arr.length;
            int sum=0;
        for(int i = 0; i < n; i++){
            sum+=(arr[i]+mid-1)/mid;
        }
        return sum;
   }
    public static int optimal(int arr[],int threshold){
        int max=greater(arr);
        int low=1;
        int mid=0;
        int high=max;
        int ans=0;
        while(low<=high){
            mid=(low+high)/2;
            int sum=divide(arr, mid);
            // System.out.println(sum);
            if(sum<=threshold){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
   }


   public static void main(String[] args){
        int arr[]={1,2,5,9};
        int ans=optimal(arr, 6);
        System.out.println(ans);
    }
}