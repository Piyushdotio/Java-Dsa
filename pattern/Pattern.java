public class Pattern {
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
    public static void invtHalfTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {

                System.out.print("*");

            }
            System.out.println();
        }
    }
    public static void numtriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n-i+1; j++) {
                    System.out.print(j);
            }
            System.out.println(" ");
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
    public static void zeroonetriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void butterfly(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.err.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.err.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
        
    }
    public static void rhombus(int n){
        for(int i=1;i<=n;i++){
            //* spaces */
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //* stars */
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void hollowrhombus(int n){
        for(int i=1;i<=n;i++){
            //* spaces */
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //* stars */
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void diamond(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            } 
            System.out.println();
        }
        for(int i=n;i>0;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            } 
            System.out.println();
        }
    }















    

    public static void main(String[] args) {
        // hollow_rectangle(4,5);
        // invtHalfTriangle(4);
        // numtriangle(5);
        // floydtriangle(5);
        // zeroonetriangle(5);
        // butterfly(4);
        // rhombus(5);
        // hollowrhombus(5);
        diamond(4);


    }
}
