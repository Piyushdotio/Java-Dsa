public class capacityToShip {
    public static int greater(int arr[]) {
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            ans = Math.max(arr[i], ans);
        }
        return ans;
    }

    public static int total(int arr[]) {
        int sum = 0;
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int reqDays(int arr[], int capacity) {
        int dayused = 1;
        int load = 0;
        int n = arr.length;
        for (int j = 0; j < n; j++) {
            if (load + arr[j] > capacity) {
                dayused += 1;
                load = arr[j];
            } else {
                load += arr[j];
            }
        }
        return dayused;
    }

    public static int brute(int arr[], int day) {
        int low = greater(arr);
        int high = total(arr);
        for (int capacity = low; capacity <= high; capacity++) {
            int daysneeded = reqDays(arr, capacity);
            if (daysneeded <= day) {
                return capacity;
            }
        }
        return 0;
    }
    public static int optimal(int arr[],int day){
        int low=greater(arr);
        int mid=0;
        int high=total(arr);
        while(low<=high){
            mid=(low+high)/2;
            int requireddays=reqDays(arr, mid);
            if(requireddays<=day){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int arr[] = { 3,2,2,4,1,4 };
        int ans = optimal(arr, 3);
        System.out.println(ans);
    }
}
