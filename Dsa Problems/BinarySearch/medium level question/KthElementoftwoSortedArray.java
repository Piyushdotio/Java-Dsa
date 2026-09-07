public class KthElementoftwoSortedArray {
    public static int brute(int arr[], int arr2[], int k) {

    int n = arr.length;
    int m = arr2.length;

    int[] arr3 = new int[n + m];

    int i = 0;
    int j = 0;
    int count = 0;

    while(i < n && j < m) {

        if(arr[i] < arr2[j]) {
            arr3[count] = arr[i];
            i++;
        }
        else {
            arr3[count] = arr2[j];
            j++;
        }

        count++;
    }

    while(i < n) {
        arr3[count] = arr[i];
        i++;
        count++;
    }

    while(j < m) {
        arr3[count] = arr2[j];
        j++;
        count++;
    }

    return arr3[k-1];
}
    public static void main(String[] args) {
        int arr1[]={100, 112, 256, 349, 770};
        int arr2[]={72, 86, 113, 119, 265, 445, 892};
        int ans=brute(arr1,arr2,7);
        System.out.println(ans);
    }
}
