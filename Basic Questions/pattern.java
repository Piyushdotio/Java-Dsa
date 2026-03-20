
public class pattern {
    public static void star(int n){

        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
      public static void inverted(int n){

        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
      public static void Numpyramid(int n){

        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
        public static void charpyramid(int n){
            char ch='A';
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    public static void hollowrec(int n){
        for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if(i==1||i==n||j==1||j==n){
                System.out.print("*");}
                        else{
                            System.out.print(" ");
                        }
            }
            System.out.println();
            
        }
    }
    public static void invhalpyramid(int n){
        for(int i=1;i<=n;i++ ){
            for(int j=1;j<=n-i;j++){

                System.out.print(" ");
          
        }
          
            for(int k=1;k<=i;k++){
                System.out.print("*");

            }
        System.out.println();
        }




    }

    public static void nopyramid01(int n)
    {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
               if( (i+j) % 2==0){
                System.out.print("1");
               }
               else{
                System.out.print("0");
               }
                    
                
            }
            

            System.out.println();
        }

    }
 public static void nopyramid121(int n)
    {
        for(int i=1;i<=n;i++){
           

            System.out.println();
        }

    }


    public static void main(String []args){
       
        // star(5);
        // inverted(4);
        // Numpyramid(5);
        // charpyramid(5);
        // hollowrec(10);
        //  invhalpyramid(4);
        //  nopyramid01(5);
         nopyramid121(6);

    }
        
    
}
