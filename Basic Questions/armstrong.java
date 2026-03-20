import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        int count=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int sum=0;
       int temp=n;
       int copy=n;
        while(copy>0){
            copy=copy/10;
            count+=1;
           
        }
        while(n>0){
            int l=n%10;
            n=n/10;
            sum+=(int)Math.pow(l,count);//math pow give value in double and sum is single so we have to type convert into int of math power
        }
        if(sum==temp){
            System.out.println("Armstrong no");
        }
        else{
            System.out.println("not armstrong no");
        }

    }
}
