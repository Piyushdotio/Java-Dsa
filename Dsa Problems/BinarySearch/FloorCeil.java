public class FloorCeil {
    public static int[] FloorAndCeil(int arr[], int k) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int mid = 0;

        int floor = -1; // for example we have to find in this [2, 4, 6, 8, 10, 12, 14] find 1 so floor = -1 and ceil=2 so we use -1 to handle edgecases
        int ceil = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == k) {
                floor = arr[mid];
                ceil = arr[mid];
                break;
            }
            if (arr[mid] < k) {
                floor = arr[mid];
                low = mid + 1;
            } else {
                ceil = arr[mid];
                high = mid - 1;
            }
        }
        return new int[] { floor, ceil };
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 4, 7, 8, 10 };
        int value[] = FloorAndCeil(arr, 9);
        System.err.println("Floor = " + value[0]);
        System.out.println("Ceil = " + value[1]);
    }
}
