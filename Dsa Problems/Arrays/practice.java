import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class practice {
    public static int brutedupliace(int arr[]) {
        int n = arr.length;
        int index = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (set.add(arr[i])) {
                arr[index] = arr[i];
                index++;
            }
            ;
        }
        return index;
    }

    public static int removeduplicatesorted(int arr[]) {
        int n = arr.length;
        int i = 0;
        for (int j = 1; j < n; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }

    public static void leftrotate(int arr[]) {
        int n = arr.length;
        int value = arr[0];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = value;

    }

    public static void rotatedplace(int arr[], int t) {
        int n = arr.length;
        t = t % n;
        int temp[] = new int[t];
        for (int i = 0; i < t; i++) {
            temp[i] = arr[i];
        }
        for (int i = t; i < n; i++) {
            arr[i - t] = arr[i];

        }
        for (int i = n - t; i < n; i++) {
            arr[i] = temp[i - (n - t)];
        }

    }

    public static void moveZeroendbt(int arr[]) {
        int n = arr.length;
        int j = 0;
        int temp[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp[j] = arr[i];
                j++;
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];

        }

    }

    public static int movezerotendop(int arr[]) {
        int n = arr.length;
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return -1;
        }
        for (int i = index + 1; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }
        return index;
    }

    public static void union(int arr[], int arr2[]) {
        int n = arr.length;
        int m = arr2.length;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        for (int i = 0; i < m; i++) {
            set.add(arr2[i]);
        }
        System.out.print(set);
    }

    public static void unionopt(int arr[], int arr2[]) {
        int n = arr.length;
        int m = arr2.length;
        int i = 0;
        int j = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (i < n && j < m) {
            if (arr[i] <= arr2[j]) {
                if (list.isEmpty() || list.get(list.size() - 1) != arr[i]) {
                    list.add(arr[i]);
                }
                i++;
            }

            else {
                if (list.isEmpty() || list.get(list.size() - 1) != arr2[j]) {
                    list.add(arr2[j]);
                }
                j++;
            }
        }
        while (i < n) {
            if (list.isEmpty() || list.get(list.size() - 1) != arr[i]) {
                list.add(arr[i]);
            }
            i++;
        }
        while (j < m) {
            if (list.isEmpty() || list.get(list.size() - 1) != arr2[j]) {
                list.add(arr2[j]);
            }
            j++;
        }
        System.out.print(list);
    }

    public static void rotdplace(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static int secondlargest(int arr[]) {
        Arrays.sort(arr);
        int n = arr.length;
        for (int i = n - 1; i > 0; i--) {
            if (arr[i] != arr[i - 1]) {
                return arr[i - 1];
            }
        }
        return -1;
    }

    public static void sortbetter(int arr[]) {
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
        for (int i = c2; i < c1 + c2; i++) {
            arr[i] = 1;
        }
        for (int i = c2 + c3; i < n; i++) {
            arr[i] = 2;
        }
    }

    public static void sortoptimal(int arr[]) {
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        for (int i = 0; i < n; i++) {
            if (arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                mid++;
                low++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;

            }
        }
    }

    public static int moorevoting(int arr[]) {
        int n = arr.length;
        int count = 0;
        int candidate = 0;
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                candidate = arr[i];
            }
            if (candidate == arr[i]) {
                count++;
            }
            if (arr[i] != candidate) {
                count--;
            }
        }
        count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == candidate) {
                count++;
            }
            if (count > n / 2) {
                return candidate;
            }
        }
        return -1;
    }

    public static int maximumsum(int arr[]){
        int n=arr.length;
        int currsum=0;;
        int maxsum=Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            currsum=0;
            for(int j = i; j < n; j++){
                currsum+=arr[j];
                maxsum=Math.max(maxsum,currsum);
            }
        }
        return maxsum;
    }
    public static int[] kadanesalgo(int arr[]){
        int temp=0;
        int start=0;
        int end=0;
        int n=arr.length;
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            currsum+=arr[i];
            if(currsum==0){
                 temp=i;
            }
            if(currsum>maxsum){
                maxsum=currsum;
                start=temp;
                end=i;
            }
        

            if(currsum<0){
                currsum+=0;
            }
        }
        return new int[]{start,end};
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, -2, 7, -4};
        int n=arr.length;
        int temp[]=kadanesalgo(arr);
        int start=temp[0];
        int end=temp[1];
        for(int i = start; i <=end; i++){
            System.out.print(arr[i]+",");
        }
        // int candidate = moorevoting(arr);
        // System.out.println(candidate);

        // sortoptimal(arr);
        // for(int i = 0; i < n; i++){
        // System.out.println(arr[i]);
        // }
        // System.out.print(secondlargest(arr));
        // int arr2[] = { 1, 2, 3, 5 };
        // int n = arr.length;
        // leftrotate(arr);
        // for(int i = 0; i < arr.length; i++){
        // System.out.println(arr[i]);
        // }
        // rotatedplace(arr, 3);
        // rotdplace(arr, 1,3);
        // movezerotendop(arr);
        // unionopt(arr, arr2);

        // for(int i = 0; i < n; i++){
        // System.out.print(arr[i]+" ");
        // }
    }
}
