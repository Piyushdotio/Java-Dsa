import java.util.*;

public class Main {
    public static void update(int marks[]){
        for(int i = 0; i < marks.length; i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter size of array");
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // System.out.println("Enter value");
        // for(int i = 0; i < n; i++){
            
        //     arr[i] = sc.nextInt();
        // }
        
        
        // System.out.println("size of array = "+arr.length);
        // sc.close();
        int[] marks={98,99,97};
        update(marks);
        for(int i = 0; i < marks.length; i++){
            System.err.println("marks of "+marks[i]);
        }
    }
}