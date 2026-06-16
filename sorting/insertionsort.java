import java.util.*;
public class insertionsort {
    public static void insertion(int a[]){
        int n=a.length;
        for(int i=1;i<=n-1;i++){
            int curr=a[i];
            int prev=i-1;
            while(prev>=0&&a[prev]>curr){
                a[prev+1]=a[prev];
                prev--;
            }
            a[prev+1]=curr;
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        insertion(arr);
        for(int nums:arr){
            System.out.println(nums);
        }
    }
}
