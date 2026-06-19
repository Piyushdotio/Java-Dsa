

public class BinarySearch {

    public static void optimal(int arr[],int x){
        int low=0,high=arr.length-1;
        int lb=arr.length;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=x){
                lb=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println(lb);
    }
        public static void main(String[] args) {
            int arr[]={1,2,3,3,5,8,8,10,10,11};
            optimal(arr,10);

        }
}
