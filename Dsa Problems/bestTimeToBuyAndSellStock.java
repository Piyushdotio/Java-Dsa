import java.util.Arrays;

public class bestTimeToBuyAndSellStock {
    public static int brute(int arr[],int n){
        int profit=0;
        int maxprofit=Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                profit=arr[j]-arr[i];
                maxprofit=Math.max(maxprofit, profit);
            }
        }
        return maxprofit;
    }

    public static int optimal(int arr[],int n){
       
        int lowest=arr[0];
        int profit=0;

        for(int i = 0; i < n; i++){
            int cost=arr[i]-lowest;
            profit=Math.max(profit,cost);
            lowest=Math.min(arr[i], lowest);
        }
        return profit;
    }
    public static void main(String[] args) {
        int arr[]={10, 7, 5, 8, 11, 9};
        int n=arr.length;
        int profit=optimal(arr,n);
        System.err.println(profit);
    }
}
