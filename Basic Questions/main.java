
import java.util.*;

public class main {

    public main(String[] args) {
        System.out.println("enter value");
        try (Scanner sc = new Scanner(System.in)) {
            
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(a + b);
            System.out.println(a - b);
            System.out.println(a * b);
            System.out.println(a / b);
            System.out.println(a % b);
        }
    }
}