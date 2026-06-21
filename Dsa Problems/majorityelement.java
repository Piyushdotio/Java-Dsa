import java.util.HashMap;

public class majorityelement {
    public static int brute(int arr[]) {// o(n^2)
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    if (count > n / 2) {
                        return arr[i];
                    }
                }
            }
        }
        return -1;
    }

    public static int better(int arr[]) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            if (map.get(arr[i]) > n / 2) {
                return arr[i];
            }
        }
        return -1;
    }

    public static int optimal(int arr[]) {// moore voting machine
        int n = arr.length;
        int candidate=0;
        int count = 0;
        for(int i = 0; i < n; i++){
            if(count==0){
                candidate=arr[i];
            }
            if(candidate==arr[i]){
                count++;
            }
            else{
                count--;
            }
        }
        
        count=0;
        for(int i = 0; i < n; i++){
            if(arr[i]==candidate){
                count++;
            }
        }
        if(count>n/2){
            return candidate;
        }
        return -1;
       
    }

    public static void main(String[] args) {
        int arr[] = { 7, 7, 5, 7, 5, 1, 5, 7, 5, 5, 7, 7, 5, 5, 5, 5};
        int value = optimal(arr);
        System.out.println(value);
    }
}
