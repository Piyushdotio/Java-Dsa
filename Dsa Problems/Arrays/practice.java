public class practice {
    public static int brute(int arr[], int k) {
        int n = arr.length;
        int length = 0;
        int maxlength = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == k) {
                    length = j - i + 1;
                }
                maxlength = Math.max(maxlength, length);

            }
        }
        return maxlength;
    }

    public static int slidingwindow(int arr[], int k) {
        int n = arr.length;
        int sum = 0;
        int left=0;
        int maxlength = 0;
        for (int right = 0; right < n; right++) {
            sum += arr[right];
            while (sum>k) {

                sum -= arr[left];
                left++;
            }

            if (sum==k) {

                maxlength = Math.max(maxlength,right-left+1);
            }
        }
        return maxlength;
        }

    public static void main(String[] args) {
        int[] arr = { 10, 5, 2, 7, 1, 9 };
        int length = brute(arr, 15);
        System.out.println(length);

    }
}