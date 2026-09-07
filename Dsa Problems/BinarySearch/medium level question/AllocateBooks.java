//is question ko recursion se bhi ker skte hai but usme exponentially chije hoti hai isliye binary search use karenge direct.
import java.util.*;
public class AllocateBooks {
    public static int min(int arr[]){
        int ans=Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            ans=Math.min(ans,arr[i]);
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
    public static boolean ispossible(int arr[],int mid,int m){
        int allocatedstudent=1;
        int pages=0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]>mid){
                return false;
            }
            if(pages+arr[i]>mid){
                allocatedstudent+=1;
                pages=arr[i];
            }
            else{
                pages+=arr[i];
            }
        }
        if(allocatedstudent>m){
            return false;
        }
        return true;


    }
    public static int optimal(int arr[],int m){
        int low=min(arr);
        int mid=0;
        int high=sum(arr);
        int resistance=-1;
        while(low<=high){
            mid=(low+high)/2;
            if(ispossible(arr,mid,m)==true){
                resistance=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return resistance;
    }
    public static void main(String[] args) {
        int arr[]={12, 34, 67, 90};
        int ans=optimal(arr,2);
        System.out.println(ans);
    }
}
