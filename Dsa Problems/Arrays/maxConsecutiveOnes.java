public class maxConsecutiveOnes {
    public static int optimal(int arr[]) {
        int n = arr.length;
        int maximum = 0;
        int count =0;
        for(int i = 0; i < n; i++){
            if(arr[i]==1){
                count++;
                maximum=Math.max(count,maximum);
            }
            else{
                count=0;
            }
        }
        return maximum;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 0, 0, 1, 1, 1, 0 };
        int consecutive = optimal(arr);
        System.out.print("Maximum Consecutive Ones = " + consecutive);
    }
}
