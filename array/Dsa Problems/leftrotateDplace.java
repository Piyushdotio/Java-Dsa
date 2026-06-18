public class leftrotateDplace {
    public static void ldbrute(int arr[],int d){
        int n=arr.length;
        d=d%n;
        int temp[]=new int[d];
        //inserting into temp
        for(int i = 0; i <d; i++){
            temp[i]=arr[i];
        }
        for(int i = d; i < n; i++){
            arr[i-d]=arr[i];
        }
        for(int i = n-d; i < n; i++){
            arr[i]=temp[i-(n-d)];
        }


    }
    public static void rotateoptimal(int arr[] ,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        // ldbrute(arr, 0);
        rotateoptimal(arr, 0, 6);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
            
        }
    }
}
