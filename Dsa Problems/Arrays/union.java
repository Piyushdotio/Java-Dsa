import java.util.ArrayList;
import java.util.HashSet;

public class union {
    public static void arrunionbrute(int arr[], int arr2[]) {
        int n = arr.length;
        int m = arr2.length;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);// nlogn
        }
        for (int i = 0; i < m; i++) {
            set.add(arr2[i]);// mlogm
        }
        System.out.print(set);
    }

    public static ArrayList<Integer> arrunionoptimal(int arr[], int arr2[]) {
        int n = arr.length;
        int m = arr2.length;
        int i = 0;
        int j = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        while (i < n && j < m) {
            if (arr[i] <= arr2[j]) {
                if (ans.isEmpty() || ans.get(ans.size() - 1) != arr[i]) {
                    ans.add(arr[i]);

                } 
                i++;
            }
            else {
                if (ans.isEmpty() || ans.get(ans.size() - 1) != arr2[j]) {
                        ans.add(arr2[j]);
                }
                j++;
            }
            
        }
        while (i < n) {
            if (ans.isEmpty() || ans.get(ans.size() - 1) != arr[i]) {
                ans.add(arr[i]);
            }
            i++;
        }
        while (j < m) {
            if (ans.isEmpty() || ans.get(ans.size() - 1) != arr2[j]) {
                ans.add(arr2[j]);
            }
            j++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 1, 2, 7 };
        ArrayList<Integer> result=arrunionoptimal(arr, arr2);
        System.out.print(result);
        
    }
}
