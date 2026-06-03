import java.util.*;
public class binaryTodecimal {
    public static void main(String[] args){
        System.out.print("Enter Binary No = ");
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        int num=n;
        int pow=0;
        int dec=0;
        while(n>0){
            int lst=n%10;
            dec=dec+lst*((int)Math.pow(2, pow));
            pow++;
            n=n/10;
        }
        System.out.println("Binary no "+num+"= "+dec);
    }
}
