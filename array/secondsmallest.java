public class secondsmallest {
    public static int optimal(int arr[]){
        int smallest=arr[0];
        int ssmallest=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                ssmallest=smallest;
                smallest=arr[i];
            }
            else if(arr[i]!=smallest && arr[i]<ssmallest){
                ssmallest=arr[i];
            }
        }
        return ssmallest;
    }

    public static void main(){
        int arr[]={3,2,6,7,8};
        System.out.println(optimal(arr));
    }
}
