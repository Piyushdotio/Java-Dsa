import java.util.*;
public class decimalToBinary {
    public static void main(String[] args){
        System.out.print("Enter Decimal value = ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pow=0;
        int bin=0;
        while(n>0){
            int rem=n%2;
            bin=bin+(rem*(int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println(bin);
   

    }
}
