public class subarray {
    public static void printsubarray(int arr[]) {
        int ts = 0;

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                for (int k = start; k < end; k++) {
                    System.out.print(arr[k] + ",");

                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total = " + ts);
    }

    public static void MAXsubarray(int arr[]) {

        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int currsum = 0;
                int end = j;
                for (int k = start; k <= end; k++) {
                    currsum += arr[k];

                }
                System.out.println(currsum);
                if (maxsum < currsum) {
                    maxsum = currsum;
                }

            }

        }
        System.out.println("maximum sum is : " + maxsum);

    }

    public static void MAXsubarrayoptimize(int arr[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[]= new int[arr.length];
        prefix[0]=arr[0];
        //calculate prefix length
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currsum=start==0?prefix[end]:prefix[end]-prefix[start-1];
                System.out.println(currsum);
                if (maxsum < currsum) {
                    maxsum = currsum;
                }

            }

        }
        System.out.println("maximum sum is : " + maxsum);

    }

    public static void kadanesalgo(int arr[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<arr.length;i++){
            cs=cs+arr[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.err.println("maximum subarray is : "+ms);
    }
    public static void main(String[] args) {
        int arr[] = { -2, -3,4,-1,-2,1,5,-3 };
        // printsubarray(arr);
        // MAXsubarray(arr);
        // MAXsubarrayoptimize(arr);
        kadanesalgo(arr);
    }
}
