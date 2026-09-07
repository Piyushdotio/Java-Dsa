import java.util.*;

public class painterPartition {
    public static int max(int arr[]){
        int ans=Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            ans=Math.max(ans,arr[i]);
        }
        return ans;
    }
    public static int sum(int arr[]){
        int ans=0;
        for(int i = 0; i < arr.length; i++){
            ans+=arr[i];
        }
        return ans;
    }
    public static boolean minworkload(int arr[],int mid ,int a){
        int worker=1;
        int work=0;
        for(int i = 0; i < arr.length; i++){
            if(work+arr[i]>mid){
                worker+=1;
                work=arr[i];
            }
            else{
                work+=arr[i];
            }
        }
        if(worker>a){
            return false;
        }
        return true;
    }
    public static int optimal(int arr[],int a,int b){
        int n=arr.length;
        int low=max(arr);
        int mid=0;
        int high=sum(arr);
        int ans=0;
        while(low<=high){
            mid=(low+high)/2;
            if(minworkload(arr, mid, a)==true){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return (int)((long) ans * b % 10000003);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 8, 11, 3 };
        int ans = optimal(arr, 10, 1);
        System.out.println(ans);
    }
}