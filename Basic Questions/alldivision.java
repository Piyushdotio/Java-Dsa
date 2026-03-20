import java.util.*;
public class alldivision {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value");
        int n=sc.nextInt();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.println(i);
            }
            if(n/i!=i){
                System.out.println(n/i);
            }
            
        }
    }
}
///pending array sekhne ke baad isko store kerke sort karunga baad mai