public class nextPermutation {
    public static void reverse(int arr[], int left, int right) {

        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void optimal(int arr[]) {
        int n = arr.length;
        int index = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                index = i;
                break;

            }

        }
        if (index == -1) {
            reverse(arr, 0, n - 1);
            return ;
        }
        for (int i = n - 1; i > index; i--) {
            if (arr[index] < arr[i]) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                break;
            }
        }
        reverse(arr, index + 1, n - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        int n = arr.length;
        optimal(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
