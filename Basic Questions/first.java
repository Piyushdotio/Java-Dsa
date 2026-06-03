import java.util.*;

public class first {

    static int add(int n, int m) {
        return n + m;
    }

    static int sub(int n, int m) {
        return n - m;
    }

    public static void main(String[] args) {
        // String a="hello";
        // String b="World";
        // System.out.println(a+" "+b);
        // int sum=add(2,3);
        // System.out.println(sum);
        // int sub=sub(5,3);
        // System.out.println(sub);

        // for (int i=2;i<10;i+=2){
        // System.out.println(i);
        // }
        // int i=0;
        // while(i<10){
        // System.out.println(i);
        // i++;
        // }
        // System.out.println("Enter value");
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // System.out.println(num);
        System.out.println("enter value");
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++){
        Scanner sc =new Scanner(System.in);
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
        // int[] a={1,2,3,4,5};
        // for (int j : a) {
        // System.out.println(j);
        // }
        // sc.close();
    }
}