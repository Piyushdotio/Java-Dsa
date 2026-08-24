import java.util.*;

public class kthmissingPositive {
    public static int greater(int arr[]) {
        int n = arr.length;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, arr[i]);
        }
        return ans;
    }

    public static int brute(int arr[], int k) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= k) {
                k++;
            } else {
                break;
            }
        }
        return k;

    }

    public static int optimal(int arr[],int k){
        int n=arr.length;
        int low=0;
        int mid=0;
        int high=n-1;
        while(low<=high){
            mid=(low+high)/2;
            int missing=arr[mid]-(mid+1);
            if(missing<k) {
                low=mid+1;
            }
            else {
                high=mid-1;
                
            }
        }
        return high+1+k;
      
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 7, 11 };
        int ans = optimal(arr, 5);
        System.out.println(ans);
    }
}
