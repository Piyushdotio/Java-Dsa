public class largestelement {
    public static int largest(int n[]){
        int size=n.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            if(n[i]>max){
                max=n[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int nums[]={5,1,6,8,3};
        int largests=largest(nums);
        System.out.println(largests);
    }
}
