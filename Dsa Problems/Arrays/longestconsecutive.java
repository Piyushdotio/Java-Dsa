import java.util.Arrays;
import java.util.HashSet;

public class longestconsecutive {
    public static boolean ls(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return true;
            }

        }
        return false;
    }

    public static int brute(int arr[]) {
        int n = arr.length;
        int longest = 1;
        if (arr.length == 0) {
            return 0;
        }
        for (int i = 0; i < n; i++) {
            int x = arr[i];
            int count = 1;
            while (ls(arr, x + 1) == true) {
                x += 1;
                count += 1;
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }

    public static int better(int arr[]) {
        int n = arr.length;
        if (arr.length == 0) {
            return 0;
        }
        int count = 1;
        int longest = 1;
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1] - 1) {
                count += 1;
                longest = Math.max(longest, count);
            } else if (arr[i] == arr[i + 1]) {
                // duplicate
            } else {
                count = 1;
            }
        }
        return longest;
    }

    public static int optimal(int arr[]) {
        int n=arr.length;
        if(n==0){
            return 0;
        }
        int longest=1;
        HashSet<Integer> set=new HashSet<>();
        
        for(int i = 0; i < n; i++){
                set.add(arr[i]);
        }
        for(int it:set){
            if(!set.contains(it-1)){
                int count=1;
                int x=it;
                while(set.contains(x+1)){
                    count+=1;
                    x=x+1;
                }
                longest=Math.max(longest,count);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int arr[] = { 100, 4, 200, 1, 3, 2 };
        System.out.println(optimal(arr));

    }
}
