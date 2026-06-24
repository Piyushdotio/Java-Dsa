import java.util.HashMap;

public class kadanesalgo {
    public static int brute(int arr[]){
        int n=arr.length;
        int maxsum=Integer.MIN_VALUE;
        int currsum=0;
        for(int i = 0; i < n; i++){
            currsum=0;
            for(int j = i; j < n; j++){
                currsum+=arr[j];
                maxsum=Math.max(maxsum,currsum);
            }
        }
        return maxsum;
    }
    
    public static int[] optimal(int arr[]){//kadanes algo o(n)
        int n=arr.length;
        int currsum=0;
        int start=0;
        int ansstart=-1;
        int end=-1;
        int maxsum=Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(currsum==0){
                start=i;
            }
            currsum+=arr[i];
            if(currsum>maxsum){
                maxsum=currsum;
                ansstart=start;
                end=i;
            }
            if(currsum<0){
                currsum=0;
            }
            
        }
        
        return new int[]{ansstart, end};
    }
    public static void main(String[] args) {
        int arr[]={2, 3, 5, -2, 7, -4};
        int n[]=optimal(arr);
        int start=n[0];
        int end=n[1];
        for(int i = start; i <= end; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
