import java.util.*;
public class removeduplicatesorted{
    public static int rdbrute(int arr[]){//nlogn+n

        int n=arr.length;
        int index=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i = 0; i < n; i++){
            if(set.add(arr[i])){
                arr[index]=arr[i];
                index++;
            }
        }
        return index;
    }
    public static int rdoptimal(int arr[]){
        int n=arr.length;
        int i=0;
        for(int j = 1; j < n; j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int arr[]={0,0,1,1,1,2,2,3,3,4};
        int k=rdoptimal(arr);
        System.out.println("total elements = "+k);
        for(int i = 0; i < k; i++){
            System.out.println(arr[i]);
        }
    }
}