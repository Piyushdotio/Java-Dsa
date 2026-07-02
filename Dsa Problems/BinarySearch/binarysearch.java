public class binarysearch{
    public static int search(int arr[],int target){
        int n=arr.length;
        int low=0;
        int mid=0;
        int high=n-1;
        while(low<=high){
            mid=(low+high)/2; // also we can use this for bigger number low+(high-low)/2
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<target){
                low=mid+1;
            }
            if(arr[mid]>target){
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[]={-1,0,3,5,9,12};
        System.err.print(search(arr, 9));;
    }
}