import java.util.HashMap;

public class appearoncetwice {
    public static int brute(int arr[]){
        int n=arr.length;
        for(int i = 0; i < n; i++){
            int num=arr[i];
            int count=0;
            for(int j = 0; j < n; j++){
                if(arr[j]==num){
                    count++;

                }
            }
            if(count==1){
                return num;
            }
        }
        return -1;
    }
    
    public static int better(int arr[]){
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int i = 0; i < n; i++){
            if(map.get(arr[i])==1){
                return arr[i];
            }
        }
        return -1;
    }
    
    public static int optimal(int arr[]){
        int n=arr.length; //o(n) 
        int Xor=0;
        for(int i = 0; i < n; i++){
            Xor ^=arr[i];
        }
        return Xor;
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,3,3,4,4};
        int num=optimal(arr);
        System.out.println(num);
    }
}
