public class reversearray{
    public static void reversearray(int a[]){
       int left=0;
       int right=a.length-1;
       while(left<right){
        int temp=a[right];
       a[ right]=a[left];
        a[left]=temp;
        left++;
        right--;
       }
    }


    public static void main(String[] args){
        int a[]={1,3,5,7,23,9};
        reversearray(a);
        //print array
        for(int i = 0; i < a.length; i++){
    System.out.print(a[i] + " ");
    }

    }
}