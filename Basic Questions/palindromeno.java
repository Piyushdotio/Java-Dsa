import java.util.*;
public class palindromeno{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        
        int r=0;
        int temp=n;
        while(n>0){
            
            int l=n%10;
            n=n/10;
            r=(r*10)+l;
        }
        System.out.println(r);
        if(temp==r){
            System.out.println("it is plaindrome no");
        }
        else{
            System.out.println("it is not palindrome number");
        }
    }
}
