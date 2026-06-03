public class functionbasics{
    public static void printhello(){
        System.out.println("hello world");
    }
    public static int add(int n,int m){//!parameters or formal parameters
        return n+m;
    }
    public static int mul(int n,int m){
        return n*m;
    }
    public static void swap(int n,int m){
        int l=n;
        n=m;
        m=l;
        System.out.println(n);
        System.out.println(m);
    }
    public static int fact(int n){
        if(n==0||n==1){
            return 1;
        }
       
        else{
            int factorial=n*fact(n-1);
            return factorial;
        }
    }
    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static int binomialcoefficient(int n,int m){
        int a=fact(n);
        int b=fact(m);
        int c=fact(n-m);
        int ncr=a/(b*c);
        return ncr;
    }
    public static boolean isprime(int n){
      boolean isprime=true;
      if(n==2){
        isprime=true;
      }
      for(int i=2;i<=n-1;i++){
            if(n%i==0){
               isprime=false;
            }
      }
      return isprime;
    }
    public static boolean optisprime(int n){
      boolean isprime=true;
      if(n==2){
        isprime=true;
      }
      for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
               isprime=false;
            }
      }
      return isprime;
    }
    public static int prime(int n){
        for(int i=2;i<=n;i++){
          if(isprime(i)){
            System.out.println(" prime no "+i);
          }
        }
        return 0;
       
    }
    //binary to decimal no conversion
    public static void binTodec(int bin){
        int mynum=bin;
        int pow=0;
        int decNum=0;
        while(bin>0){
          int lst=bin%10;
          decNum=decNum+(lst*(int)Math.pow(2,pow));
          pow++;
          bin=bin/10;

        }
        System.out.println("decimal of "+mynum+"= "+decNum);
    }
    public static void main(String[] args){
        // printhello();
        // int sum=add(5,7);//!arguments or actual parameter
        // System.out.println("sum = "+sum);
        // swap(5,7);
        // int multiply=mul(5,3);
        // System.out.println(multiply);
        // ! Factorial
        // int factorial=fact(5);
        // System.out.println(factorial);
        // int factol=factorial(6);
        // System.out.println(factol);
        // int binomialcoefficients=binomialcoefficient(5, 3);
        // System.out.println(binomialcoefficients);
        // boolean prime=isprime(2);
        // System.out.println(prime);
        // prime(10);
        binTodec(11110 );
        
    }

}