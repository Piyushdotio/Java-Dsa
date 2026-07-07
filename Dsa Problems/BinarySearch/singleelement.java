public class singleelement {
    public static int singleNonDuplicate(int[] arr) {
        int n = arr.length;
        int low = 1;
        int mid = 0;
        int high = n - 2;
        int ans = 0;
        if (n == 1) {
            return arr[0];
        }
        if (arr[0] != arr[1]) {
            return arr[0];
        }
        if (arr[n - 1] != arr[n - 2]) {
            return arr[n - 1];
        }
        while (low <= high) {
            mid = (low + high) / 2;

            if (mid % 2 == 0) {
                if (arr[mid] == arr[mid + 1]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            if (mid % 2 != 0) {
                if (arr[mid] == arr[mid - 1]) {
                    low = mid + 1;
                }
                if (arr[mid] != arr[mid - 1]) {
                    high = mid - 1;
                }
            }
        }
        return arr[low];
    }

    public static int singleNonDuplicatebrute(int[] nums) {
        for (int i = 0; i < nums.length - 1; i = i + 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1,2, 2, 3, 4, 4, 8, 8 };
        System.out.println(singleNonDuplicatebrute(arr));

    }

}