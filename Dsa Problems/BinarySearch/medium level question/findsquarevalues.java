import java.util.*;
public class findsquarevalues {
    public static int brute(int value){
        int ans=(int)Math.sqrt(value);
        return ans;
    }
    public static int better(int value){
        int ans=0;
        for(int i = 0; i <=value; i++){
            if(i*i<=value){
                ans=i;
            }
            else{
                break;
            }
        }
        return ans;
    }
    public static int optimal(int value){
        int ans=1;
        int low=1;
        int mid=0;
        int high=value;
        while(low<=high){
            mid=(low+high)/2;
            if(mid*mid==value){
                ans=mid;
                break;
            }
            if(mid*mid<value){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return high;
    }
    
    public static void main(String[] args){

        System.out.println(optimal(28));
    }
}
