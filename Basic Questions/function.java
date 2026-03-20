import java.util.*;
public class function {
    public static void Factorial(int n){
        int f=1;
            for(int i=n;i>0;i--){
                f=f*i;
            }
            System.out.println(f);
    }
    public static void main(String []args){
        System.out.println("Enter No For Factorial");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Factorial(n);

    }
}
