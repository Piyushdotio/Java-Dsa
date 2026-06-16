public class diagonalsum {
    public static int diagonalbrute(int matrix[][]){//O(n^2)
        int sum=0;
        //primary diagonal and secondary diagonal
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length;j++){
                if(i==j){
                    sum+=matrix[i][j];
                }
                 else if(i+j==matrix.length-1){
                    sum+=matrix[i][j];
                }
            }
        }
        return sum;
    } 
    public static int diagonaloptimize(int matrix[][]){//O(n)
        int sum=0;
        for(int i = 0; i < matrix.length; i++){
            //primary diagonal
            sum+=matrix[i][i];
            //secondary diagonal
            if(i!=matrix[i][matrix.length-1-i]){

                sum+=matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }  
    public static void main(String[] args) {
        int matrix[][]={
           {1,2,3},
           {4,5,6},
           {7,8,9},
        };
        int sum=diagonalbrute(matrix);
        System.out.println(sum+" ");
    }

}