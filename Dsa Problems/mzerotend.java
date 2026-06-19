import java.util.*;

public class mzerotend {// move zero to end
    public static void movezerotoendbrute(int arr[]) {// o(2n)
        int n = arr.length;
        int temp[] = new int[n];
        int j = 0;
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

    public static void mzendoptimal(int arr[]) {
        int n = arr.length;
        int j = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
        if (j == -1) {
            return;
        }
        for (int i = j + 1; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 4, 0, 5, 2 };
        int n = arr.length;
        // movezerotoendbrute(arr);
        mzendoptimal(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ",");
        }
    }

}
