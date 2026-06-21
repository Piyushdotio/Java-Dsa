public class majorityelement {
    public static int brute(int arr[]){//o(n^2)
        int n=arr.length;
        for(int i = 0; i < n; i++){
            int count=0;
            for(int j = 0; j < n; j++){
                    if(arr[i]==arr[j]){
                        count++;
                        if(count>n/2){
                            return arr[i];
                        }
                    }
            }
        }
        return -1;
    }
   
    public static int better(int arr[]){
        
    }
   
    public static void main(String[] args) {
        int arr[]={3,2,3};
        System.out.println(brute(arr));
    }
}
