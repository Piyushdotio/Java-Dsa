public class practicearray {
    public static int linearsearch(int arr[], int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return i;
            }
        }
        return -1;
    }

    public static int largest(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;

    }

    public static int smallest(int arr[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }

    public static int binarysearch(int arr[], int key) {

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                start = arr[mid] + 1;
            } else {
                end = arr[mid] - 1;
            }
        }
        return -1;
    }


    public static void reversearray(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        }

    }
    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 5, 7 };
        // int key = 1;
        // int index = linearsearch(arr, key);
        // if (index == -1) {
        // System.out.println("key not found");
        // } else {

        // System.out.println("key found at index : " + index);
        // }
        // System.out.println(largest(arr));
        // System.out.println(smallest(arr));

        // System.out.println("key found at index : "+binarysearch(arr, key));
        reversearray(arr);
        for(int i = 0; i <arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
