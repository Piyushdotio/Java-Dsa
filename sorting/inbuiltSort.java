import java.util.*;
public class inbuiltSort {
     public static void main(String[] args) {
        Integer arr[]={5,4,1,3,2};
        // Arrays.sort(arr);
        // ! Collection makes object so we cannot use normal int we have to write Integer
        Arrays.sort(arr,Collections.reverseOrder());
        // Arrays.sort(arr,0,3);
        // Arrays.sort(arr,2,5);
        for(Integer nums:arr){
            System.out.println(nums);
        }
    }
}
