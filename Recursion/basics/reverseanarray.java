public class reverseanarray {
    public static int[] brute(int[] arr){
        return helper(arr,0,arr.length-1);
    }
    public static int[] helper(int arr[],int left,int right){
        if(left>=right){
            return arr;
        }
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        return helper(arr, left+1, right-1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int ans[]=brute(arr);
        for(int i = 0; i < ans.length; i++){
            System.out.println(ans[i]);
        }
    }
}
