import java.util.Arrays;


public class largestelement {

    public static int bruteforce(int[] num ){
        Arrays.sort(num);
        return num[num.length-1];
    }



///optimal way and complexity is O(n)
    public static int largest(int[] num) {
        int max = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        return max;
    }
    public static int largestcheck(int[] arr){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static int smallest(int[] arr){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 1, 5, 7 };
        // System.out.println("second largest element"+bruteforce(arr));
        // System.out.println("Largest element: " + largest(arr));
        // System.out.println("largest no is = "+largestcheck(arr));
        System.out.println("smallest no is = "+smallest(arr));


    }
}
