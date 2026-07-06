import java.util.ArrayList;
import java.util.List;

public class findKRotation {
    public static int optimal(ArrayList<Integer> arr) {
        int n = arr.size();
        int low = 0;
        int mid = 0;
        int high = n - 1;
        int ans = Integer.MAX_VALUE;
        int index = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr.get(low) <= arr.get(high)) {
                if (arr.get(low) < ans) {
                    ans = arr.get(low);
                    index = low;
                }
                break;
            }
            if (arr.get(low) <= arr.get(mid)) {
                if (ans > arr.get(low)) {
                    ans = arr.get(low);
                    index = low;
                }
                low = mid + 1;
            } else {
                if (ans > arr.get(mid)) {
                    ans = arr.get(mid);
                    index = mid;
                }

                high = mid - 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(List.of(4, 5, 6, 7, 0, 1, 2, 3));
        int ans = optimal(arr);
        System.out.println(ans);
    }
}
