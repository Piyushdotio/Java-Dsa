public class countOnetoTen {
    public static void brute(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        brute(n-1);
      

    }
    public static void main(String[] args) {
        brute(10);
    }
}
