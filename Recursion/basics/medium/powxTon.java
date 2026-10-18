public class powxTon{
    public static double brute(double x,int n){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 1/brute(x,-n);
        }
        return x*brute(x, n-1);

        
    }
    public static double optimal(double x,int n){
        long power=n;//for handling edge case converting n in long
        boolean negative=power<0;//power<0 means negative
        if(negative){
            power=-power;//convert negative power to positive power
        }
        double result=helper(x,power);//calling helper to calculate power
        return negative?1/result:result;//if negative than 1/result if positive than result
    }
    private static double helper(double x,long n){
        if(n==0){
            return 1.000;//base condition if x^0 means 1;
        }
        double half=helper(x, n/2);
        if(n%2==0){//if even 
            return half*half;
        }
        return half*half*x;
    }
    public static void main(String[] args) {
        System.out.println(optimal(2.00000, -2));
    }
}

//if x^n is even formula (x^2)^n/2
//x^n is even formula (x^2)^n/2