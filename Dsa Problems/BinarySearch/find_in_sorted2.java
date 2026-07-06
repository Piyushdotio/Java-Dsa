public class find_in_sorted2{
    public static boolean brute(int arr[],int target){
        int n=arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
    
    public static boolean optimal(int arr[],int k){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int mid=0;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]==k){
                return true;
            }
            if(arr[low]==arr[mid]&&arr[mid]==arr[high]){
                low++;
                high--;
                continue;
            }
            if(arr[low]<=arr[mid]){
                if(arr[low]<=k&&arr[mid]>=k){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(arr[mid]<=k&&arr[high]>=k){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int arr[]={2,5,6,0,0,1,2};
        boolean a=optimal(arr,0);
        System.out.println(a);
    }
}






