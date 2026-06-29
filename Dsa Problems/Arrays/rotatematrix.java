import java.util.Collections;

public class rotatematrix {
    public static int[][] brute(int arr[][]) {// O(n^2)
        int n = arr.length;
        int m = arr[0].length;
        int matrix[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[j][(n - 1) - i] = arr[i][j];
            }
        }
        return matrix;
    }

    public static void swap(int arr[][], int i, int j) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }

    public static int[][] optimal(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                swap(arr, i, j);
            }
        }
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;

            while (left < right) {
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        optimal(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        // int matrix[][]=better(arr);
        // int n=matrix.length;
        // int m=matrix[0].length;
        // for(int i = 0; i < n; i++){
        // for(int j = 0; j < m; j++){

        // System.out.print(matrix[i][j]+" ");
        // }
        // System.out.println( );
        // }
    }
}
