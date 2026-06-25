import java.util.ArrayList;
import java.util.List;

public class leaderinarray{
    public static int[] brute(int arr[]){
        int n=arr.length;
        int p=0;
        int newarr[]=new int[n];
        for(int i = 0; i < n; i++){
            boolean leader=true;
            for(int j = i+1; j < n; j++){
                if(arr[i]<arr[j]){
                    leader=false;
                    break;
                }
            }
            if(leader==true){
                newarr[p]=arr[i];
                p++;
            }
        }
        return newarr;
    }
    
    public static List<Integer> optimal(int arr[]){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        List<Integer> ans= new ArrayList<>();
        for(int i = n-1; i>=0; i--){
            if(arr[i]>max){
                ans.add(arr[i]);
                max=arr[i];
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int arr[]={-3, 4, 5, 1, -4, -5};
        List<Integer> ans=optimal(arr);
        System.out.println(ans);
    }
}