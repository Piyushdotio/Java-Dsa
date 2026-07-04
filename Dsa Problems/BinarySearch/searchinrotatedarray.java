public class searchinrotatedarray {
     public static int search(int[] arr, int target) {
        int n=arr.length;
        int low=0;
        int mid=0;
        int high=n-1;
        while(low<=high){
            mid=(low+high)/2;
           if(arr[mid]==target){
                return mid;
           }
           if(arr[mid]>=arr[low]){
               if(target >= arr[low] && target <= arr[mid]){
                    high=mid-1;
               }
                else{
                    low=mid+1;
                }
           }
           if(arr[low]>arr[mid]){
            if(target>=arr[mid]&&target<=arr[high]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
           }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int ans=search(arr, 0);
        System.out.println(ans);
    }
}
