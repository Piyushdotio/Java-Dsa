public class leftrotate {
    public static void leftrotatebrute(int arr[]){// o(n)
        int n=arr.length;
        int i=arr[0];
        for(int j = 0; j < n-1; j++){
            arr[j]=arr[j+1];
            
        }
        arr[n-1]=i;
        
    }
    public static void main(String[] args) {
        int arr[]={-1,0,3,6};
        leftrotatebrute(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+",");
        }
    }   
}
