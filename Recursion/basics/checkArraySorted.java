public class checkArraySorted {
    public static boolean brute(int arr[],int left,int count){
        if(left==arr.length){
            return count<=1;
        }
        if(arr[left]>arr[(left+1)%arr.length]){
            count++;
        }

        return brute(arr,left+1,count);
        
       
    }
    public static void main(String[] args) {
        
        int arr[]={3,4,5,1,2};
        int left=0;
        System.out.println(brute(arr,left,0));
    }
}
