public class goodNo {
    public static int countGoodNumbers(long n) {
        long MOD = 1_000_000_007L;
        long even=n/2+n%2;
        long odd=n/2;

        long a=longPower(5,even);
        long b=longPower(4,odd);
        long ans=(a*b)%MOD;
        return (int)ans;
    }
    public static long longPower(long base,long expo){
        long MOD = 1_000_000_007L;
            if(expo==0){
                return 1;
            }
        long half = longPower(base, expo / 2);
        long result = (half*half)%MOD;

        if (expo % 2 == 1) {
          result=(result*base)%MOD;
         }

        return result;

    }

    public static void main(String[] args) {
        System.out.println(countGoodNumbers(4));
    }
}