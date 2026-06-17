import java.util.Arrays;
public class secondlargest {
    public static int secondlargebrute(int arr[]){ //time complexity:nlogn+n
        Arrays.sort(arr);
        int n=arr.length;
        int largest=arr[n-1];
        int secmax=0;
        for(int i = n-2; i >=0; i--){
            if(arr[i]!=largest){
                secmax=arr[i];
                break;
            }
        }
        return secmax;
    }
    public static int secondlargebetter(int arr[]){
        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
        int n=arr.length;
        //first pass
        for(int i = 0; i < n; i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        for(int i = 0; i < n; i++){
            if(arr[i]!=largest && secondlargest<arr[i]){
                secondlargest=arr[i];
            }
        }
        return secondlargest;
    }
    public static int secondlargeoptimal(int arr[]){
        int n=arr.length;
        int largest=Integer.MIN_VALUE;
        int secondlarge=Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(arr[i]>largest){
                secondlarge=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondlarge && arr[i]!=largest){
                secondlarge=arr[i];
            }
        }
        return secondlarge;
    }
    public static void main(String[] args) {
        int nums[]={8, 8, 7, 6, 5};
        // int secondlargest=secondlargebrute(nums);
        int secondlargest=secondlargebetter(nums);
        // int secondlargest=secondlargeoptimal(nums);
        System.out.println(secondlargest);
    }
}
