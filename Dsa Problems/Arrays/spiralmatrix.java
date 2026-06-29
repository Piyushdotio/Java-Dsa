import java.util.ArrayList;
import java.util.List;

public class spiralmatrix {
    public static List<Integer> brute(int arr[][]){//O(n*m)
        int n=arr.length;
        int m=arr[0].length;
        List<Integer> lst=new ArrayList<>();
        int top=0;
        int bottom=n-1;
        int left=0;
        int right=m-1;
        while(top<=bottom && left<=right){
           for(int j = left; j <= right; j++){
            
                lst.add(arr[top][j]);
                
            }
            top++;
           for(int i = top; i <= bottom; i++){
               lst.add(arr[i][right]);
            }
        
        right--;
            if(top<=bottom){

           for(int j = right; j >=left; j--){
               lst.add(arr[bottom][j]);
            }
            bottom--;
        }
           for(int i = bottom; i >= top; i--){
            if(left <= right){
               lst.add(arr[i][left]);
            }
        }
        left++;
        }
        return lst;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer> lst=brute(arr);
        System.out.print(lst);
    }
}
