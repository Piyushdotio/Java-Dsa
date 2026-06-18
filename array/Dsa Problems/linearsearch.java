public class linearsearch {
    public static int linearsearch(int arr[],int key){
        int n=arr.length;
        int index=-1;
        for(int i = 0; i < n; i++){
            if(arr[i]==key){
                index=i;
                break;
            }
            
        }
        return index;
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,3};
        
        System.out.println(linearsearch(arr,5));

    }
}

