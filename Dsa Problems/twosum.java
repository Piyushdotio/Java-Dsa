import java.util.HashMap;

public class twosum {
    public static int[] brute(int arr[], int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] { i, j };

                }
            }
        }
        return new int[] { -1, -1 };
    }
    public static int[] better(int arr[],int target){
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i = 0; i < n; i++){
            int a=arr[i];
            int required=target-a;
            if(map.containsKey(required)){
                return new int[]{map.get(required), i};
            }
            map.put(arr[i], i);
        }
        return new int[]{-1,-1};
    }
    public static int[] optimal(int arr[],int target){
        int r=arr.length-1;
        int l=0;
        while(l<r){
            int sum=arr[l]+arr[r];
            if(sum==target){
                return new int[]{l,r};
            }
            if(sum<target){
                l++;
            }
            if(sum>target){
                r--;
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int arr[] = { 2, 7, 11, 15 };
        int ans[] = better(arr, 9);

        System.out.println(ans[0] + " " + ans[1]);
    }
}
