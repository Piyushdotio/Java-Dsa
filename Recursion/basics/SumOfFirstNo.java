public class SumOfFirstNo {
    public static int brute(int n){
        if(n==0){
            return 0;
        }
        return n+brute(n-1);
    }
    public static void main(String[] args){
        int ans=brute(4);
        System.out.println(ans);
    }
}
