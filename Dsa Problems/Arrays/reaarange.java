

public class reaarange {
    public static void brute(int arr[]){
        int n=arr.length;
        int t=0;
        int p=0;
        int positive[]=new int[n];
        int negative[]=new int[n];
        for(int i = 0; i < n; i++){
            if(arr[i]>0){
                positive[t]=arr[i];
                t++;
            }
            if(arr[i]<0){
                negative[p]=arr[i];
                p++;
            }
        }
        t=0;
        p=0;
        for(int i = 0; i < n; i++){
            if(i%2==0){
                arr[i]=positive[t];
                t++;
            }
            else{
                arr[i]=negative[p];
                p++;
            }
        }
    }
    

    public static int[] optimal(int arr[]){
        int n=arr.length;
        int positive=0;
        int negative=1;
        int ans[]=new int[n];
        for(int i = 0; i < n; i++){
            if(arr[i]>0){
                ans[positive]=arr[i];
                positive+=2;
            }
            else{
                ans[negative]=arr[i];
                negative+=2;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={2, 4, 5, -1, -3, -4};
        int n=arr.length;
        int ans[]=optimal(arr);
        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i]+",");
        }
    }
}
