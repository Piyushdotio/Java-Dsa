public class consecutiveinarray{
    public static boolean linearsearch(int arr[],int x){
        for(int i = 0; i < arr.length; i++){
            if(arr[i]==x){
                return true;
            }
        }
        return false;
    }
    public static int brute(int arr[]){
        int n=arr.length;
        int longest=1;
        for(int i = 0; i < n; i++){
            int current=arr[i];
            int count=1;
            while(linearsearch(arr, current+1)){
                current++;
                count++;
            }
            longest=Math.max(longest,count);
        }

        return longest;
    }

    public static void main(String[] args) {
        int arr[]={0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.print(brute(arr));;
    }
}