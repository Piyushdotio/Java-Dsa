import java.util.*;
public class matrixMedian {
    public static int brute(int arr[][]){
        int n=arr.length;
        int m=arr[0].length;
        int p=0;
        int arr2[]=new int[n*m];
        int length=arr2.length;
        int ans=length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr2[p]=arr[i][j];
                p++;
            }
        }
        Arrays.sort(arr2);
        if(length%2==1){
            ans=arr2[length/2];
        }
        else{
            ans = (arr2[length/2 - 1] + arr2[length/2]) / 2;
        }
        return ans;
    }
    public static int upperbound(int arr[],int x){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>x){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static int smallerthanvalues(int arr[][],int x){
        int count=0;
        for(int i = 0; i < arr.length; i++){
            count+=upperbound(arr[i],x);
        }
        return  count;
    }
    public static int optimal(int arr[][]){//n*log base2 m
        int n=arr.length;
        int m=arr[0].length;
        int low=arr[0][0];
        int high=arr[n-1][m-1];
        int req=(n*m)/2;
        while(low<=high){
            int mid=(low+high)/2;
            int smallerreq=smallerthanvalues(arr,mid);
            if(smallerreq<=req){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
   public static void main(String[] args) {
        int arr[][]={ {1, 4, 9}, {2, 5, 6},{3, 7, 8}};
        int ans=optimal(arr);
        System.out.println(ans);
   } 
}
