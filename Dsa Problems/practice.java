import java.util.HashSet;

public class practice {
    public static int brutedupliace(int arr[]){
        int n=arr.length;
        int index=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i = 0; i < n; i++){
            if(set.add(arr[i])){
                arr[index]=arr[i];
                index++;
            };
        }
        return index;
    }

    public static int  removeduplicatesorted(int arr[]){
        int n=arr.length;
        int i=0;
        for(int j = 1; j < n; j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
    
    public static void leftrotate(int arr[]){
        int n=arr.length;
        int value=arr[0];
        for(int i = 0; i < n-1; i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=value;
        

    }

    public static void rotatedplace(int arr[],int t){
        int n=arr.length;
        t=t%n;
        int temp[]=new int[t];
        for(int i = 0; i < t; i++){
            temp[i]=arr[i];
        }
        for(int i=t; i <n; i++){
            arr[i-t]=arr[i];
           
        }
        for(int i = n-t; i < n; i++){
            arr[i]=temp[i-(n-t)];
        }

    }
    
    
    public static void rotdplace(int arr[],int start,int end){
        while (start<end) {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        // leftrotate(arr);
        // for(int i = 0; i < arr.length; i++){
        //    System.out.println(arr[i]); 
        // }
        // rotatedplace(arr, 3);
        rotdplace(arr, 1,3);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
