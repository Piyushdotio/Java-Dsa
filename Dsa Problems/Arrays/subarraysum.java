public class subarraysum {
    public static int brute(int arr[],int k){
        int n=arr.length;
        int count=0;
        for(int i = 0; i < n; i++){
            for(int j= i; j < n; j++){
                int sum=0;
                for(int p = i; p <= j; p++){
                    
                    sum=sum+arr[p];
                }
                if(sum==k){
                    count++;
                }
            }
           
            
        }
        return count;

    }

    public static int better(int arr[],int k){
        int n=arr.length;
        int count=0;
        for(int i = 0; i < n; i++){
            int sum=0;
            for(int j= i; j < n; j++){
                sum=sum+arr[j];
                if(sum==k){
                    count++;
                }
            }
           
            
        }
        return count;

    }
    public static void main(String[] args){
        int arr[]={1,1,1};
        int count=brute(arr,2 );
        System.out.print(count);
    }
}
