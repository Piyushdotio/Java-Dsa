public class practice {
    public static void hollow_rectangle(int rows, int columns) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                if (i == 1 || i == rows || j == 1 || j == columns) {

                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void inverhaltriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for(int k=n-i;k<n;k++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
    public static void invtHalfTriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void floydtriangle(int n){
        int count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count);
                count++;
            }
            
        System.out.println();
        }
    }

    public static void main(String[] args) {
        // hollow_rectangle(4, 5);
        // inverhaltriangle(5);
        // invtHalfTriangle(5);
        floydtriangle(5);
    }
}
