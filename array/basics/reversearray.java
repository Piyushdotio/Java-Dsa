public class reversearray {
    public static void reversearray(int[] n){
        int start=0;
        int end=n.length-1;
        while(start<end){
            int temp=n[start];
            n[start]=n[end];
            n[end]=temp;
            start++;
            end--;
        }
        
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        reversearray(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
