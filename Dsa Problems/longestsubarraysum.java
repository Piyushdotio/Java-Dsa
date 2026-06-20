import java.util.HashMap;

public class longestsubarraysum {
    public static int brute(int arr[], int k) {
        int n = arr.length;
        int longest = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];

                if (sum == k) {
                    longest = Math.max(longest, j - i + 1);
                }
            }
        }
        return longest;
    }

    public static int better(int arr[], int k) {
        int n = arr.length;
        int currsum = 0;
        int longest = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            currsum += arr[i];
            if (currsum == k) {
                longest = Math.max(longest, i + 1);
            }
            int rem = currsum - k;
            if (map.containsKey(rem)) {
                int len = i - map.get(rem);
                longest = Math.max(longest, len);
            }
            if (!map.containsKey(currsum)) {
                map.put(currsum, i);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 5, 2, 7, 1, 9 };
        System.out.println(better(arr, 15));
    }
}
