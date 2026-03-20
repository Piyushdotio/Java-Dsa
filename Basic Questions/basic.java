import java.util.Scanner;

public class basic{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        n = Math.abs(n); // handle negative numbers

        if (n == 0) {
            System.out.println(1);
            return;
        }

        int count = 0;

        while (n > 0) {
            count++;
            n = n / 10;
        }

        System.out.println(count);
    }
}
