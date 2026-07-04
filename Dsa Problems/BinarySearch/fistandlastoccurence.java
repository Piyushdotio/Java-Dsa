public class fistandlastoccurence {
     public int[] searchRange(int[] arr, int target) {

        int first = -1;
        int last = -1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {

                if (first == -1) {
                    first = i;
                }

                last = i;
            }
        }

        return new int[]{first, last};
    }
}
    public static int lowerbound(int arr[], int k) {// k is target
        int n = arr.length;
        int low = 0;
        int ans = n;
        int mid = 0;
        int high = n - 1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] >= k) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int upperbound(int arr[], int k) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int mid = 0;
        int ans = n;
        while (low <= high) {
            mid = (high + low) / 2;
            if (arr[mid] > k) {
                ans = mid;
                high = mid - 1;

            } else {
                low = mid + 1;

            }
        }
        return ans;
    }

    public static int[] firstandlast(int arr[], int k) {
        int first = lowerbound(arr, k);
        if (first == arr.length || arr[first] != k) {
            return new int[] { -1, -1 };
        }
        int last = upperbound(arr, k);
        return new int[]{first, last-1};
    }

    public static void main(String[] args) {
        int arr[] = { 5, 7, 7, 8, 8, 10 };
        int occurence[] = firstandlast(arr, 8);
        System.out.println("first occurence: " + occurence[0]);
        System.out.println("last occurence: " + occurence[1]);
    }

}
