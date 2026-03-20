import java.util.*;
public class reverseno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        
        int r=0;
        while(n>0){
            
            int l=n%10;
            n=n/10;
            r=(r*10)+l;
        }
        System.out.println(r);
    }
}
