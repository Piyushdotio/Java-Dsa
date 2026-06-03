import java.util.*;

public class linearSearch{
    public static int lrSearch(int[] a,int n){
        for(int i = 0; i <a.length; i++){
            if(a[i]==n){
                return i;
            }
          
        }
        return -1;
    }
    public static void main(String[] args) {
            int[] num={2,4,6,8,10,12};
            int key=20;
            int index=lrSearch(num,key);
            if(index==-1){
                System.out.println("Key not found");
            }
            else{
                System.out.println("Key found at index : "+index);
            }
    }
}