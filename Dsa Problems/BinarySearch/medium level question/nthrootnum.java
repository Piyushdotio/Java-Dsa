import java.util.*;

public class nthrootnum {
    public static int brute(int power,int number){
        int ans=-1;
        for(int i = 1; i < number; i++){
            if(Math.pow(i,power)==number){
                ans=i;
            }
        }
        return ans;
    }
    public static int optimal(int n,int m) {
        int low=1;
        int high=m;
        int mid=0;
        while(low<=high){
            mid=(low+high)/2;
            double value=Math.pow(mid,n);
            if(value==m){
                 return mid;
            }
            if(value<m){
                low=mid+1;
            }
            if(value>m){
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(optimal(3, 27));
    }
}
