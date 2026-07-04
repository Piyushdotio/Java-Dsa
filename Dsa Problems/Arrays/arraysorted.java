public class arraysorted {
   public static int sortedrotatedbrute(int arr[]){
        int n=arr.length;
        int count=0;
        for(int i = 0; i < n; i++){
            if(arr[i]>arr[(i+1)%n]){
                count ++;
            }
        }
        return (count<=1)?1:-1;
   }
    public static void main(String[] args) {
        int arr[]={4,5,1,2,3};
        int check=sortedrotatedbrute(arr);
        System.out.println(check);
    }
}
