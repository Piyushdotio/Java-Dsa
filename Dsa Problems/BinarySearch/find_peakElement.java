import java.util.Arrays;

public class find_peakElement {
    public static int peakbrute(int arr[]){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        int index=0;
        for(int i = 0; i < n; i++){
            if(max<arr[i]){
                max=arr[i];
                index=i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,1};
        System.out.println(peakbrute(arr));
    }
    
}