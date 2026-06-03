import java.util.*;

public class secondlargestelement {
    // brute approach
    public static int bruteforce(int[] num) {
        Arrays.sort(num);
        int largest = num[num.length - 1];
        int secondLargest = 0;
        for (int i = num.length - 2; i > 0; i--) {
            if (num[i] != largest) {
                secondLargest = num[i];
                break;
            }
        }
        return secondLargest;

    }

    // best approach
    public static int best(int[] num) {
        int var1 = num[0];
        int secondlargest = -1;

        // 1st phase check largest element
        for (int i = 0; i < num.length; i++) {
            if (num[i] > var1) {
                var1 = num[i];
            }

        }
        // 2nd phase compare to largest that not equal to largest and shifting secondlargest if it founds
        for (int i = 1; i < num.length; i++) {
            if (num[i] != var1 && num[i] > secondlargest) {
                secondlargest=num[i];
            }
        }
        return secondlargest;
    }

    //optimal approach
    public static int optimal(int[] num){
        int largest=num[0];
        int slargest=-1;
        for(int i=0;i<num.length;i++){
            if(num[i]>largest){
                slargest=largest;
                largest=num[i];
            }
            else  if(num[i]<largest && num[i]>slargest){
                slargest=num[i];
            }
        }
        return slargest;
    }
    public static void main(String[] args) {
        int arr[] = { 8, 8, 7, 6, 5 };
        System.out.println("second largest element is :" +bruteforce(arr));
        System.out.println("best approach : " + best(arr));
        System.out.println("optimal approach : "+optimal(arr));
    }
}
