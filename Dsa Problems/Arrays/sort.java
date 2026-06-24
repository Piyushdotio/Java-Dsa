import java.util.*;

public class sort {
    public static void sortzotbrute(int arr[]) {// sort 0 1 2 in decreasing order
        Arrays.sort(arr); // nlogn
    }

    public static void better(int arr[]) { //o(n)
        int n = arr.length;
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                c1++;
            } else if (arr[i] == 1) {
                c2++;
            } else {
                c3++;
            }

        }
        for (int i = 0; i < c1; i++) {
            arr[i] = 0;
        }
        for (int i = c1; i < c1 + c2; i++) {
            arr[i] = 1;
        }
        for (int i = c1 + c2; i < n; i++) {
            arr[i] = 2;
        }
    }

    public static void optimal(int arr[]){//dutch national flag algorithm 
        int n=arr.length;
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = { 1, 0, 2, 1, 0 };
        optimal(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
