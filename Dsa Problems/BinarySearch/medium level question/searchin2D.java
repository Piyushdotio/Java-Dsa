public class searchin2D {
    public static boolean brute(int arr[][], int k) {
        int n = arr.length;
        int m = arr[0].length;
        boolean ans = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == k) {
                    ans = true;
                    break;
                }
            }
        }
        return ans;
    }

    public static int lowerbound(int arr[],int m,int k){
        int low=0;
        int mid=0;
        int high=m-1;
        int ans=m;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]>=k){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

    public static boolean mine(int arr[][], int target) {
        int n=arr.length;
        int m=arr[0].length;
        boolean ans=false;
        for(int i = 0; i < n; i++){  
            int check=lowerbound(arr[i],m, target);
            if(check<m){
                if(arr[i][check]==target){
                ans=true;
                }
            }
            
        }
        return  ans;
    }
    public static boolean better(int arr[][],int k){
        int i=0;
        int j=arr[0].length-1;
        boolean ans=false;
        while(i<arr.length && j>=0){
            if(arr[i][j] == k){
                ans=true;
            }
            if(arr[i][j]>k){
                j--;
            }
            else{
                i++;
            }
        }
        return  ans;
    }
    public static boolean optimal(int arr[][],int k){
        int n=arr.length;
        int m=arr[0].length;
        if(n==0){
            return false;
        }
        int low=0;
        int high=(n*m)-1;
        boolean ans=false;
        while(low<=high){
            int mid= (low + (high-low)/2);
            if(arr[mid/m][mid%m]==k){
                ans=true;
            }
            if(arr[mid/m][mid%m]>k){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int arr[][] = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        boolean ans = optimal(arr, 3);
        System.out.println(ans);
    }
}
