public class kadanesalgo {
    public static int brute(int arr[]){
        int n=arr.length;
        int maxsum=Integer.MIN_VALUE;
        int currsum=0;
        for(int i = 0; i < n; i++){
            currsum=0;
            for(int j = i; j < n; j++){
                currsum+=arr[j];
                maxsum=Math.max(maxsum,currsum);
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int arr[]={2, 3, 5, -2, 7, -4};
        System.out.println(brute(arr));


    }
}
