import java.util.*;

public class checksortedarray {

    public static int bruteforce(int arr[]){
        int sorted=arr[0];
        for(int i=0;i<arr.length;i++){
           
        }
        return 0;
    }
    public static int mine(int arr[]){
        Arrays.sort(arr);
        int num[]=arr;
        for(int i=0;i<arr.length;i++){
            System.out.println(num[i]);
        }
        if(num!=arr){
            System.out.println("not sorted");
        }
        return 0;
    }
    public static void main(){
        int arr[]={2,1,5,7,3};
        System.out.println(mine(arr));
    }
}
