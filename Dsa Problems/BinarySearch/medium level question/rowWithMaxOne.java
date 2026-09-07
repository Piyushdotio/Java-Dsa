public class rowWithMaxOne {
    public static int brute(int arr[][]){
        int rows=arr.length;
        int column=arr[0].length;

        int maxcount=0;
        int answerRow=-1;

        for(int i = 0; i < rows; i++){
            int count =0;
            for(int j = 0; j < column; j++){
                    if(arr[i][j]==1){
                        count++;
                    }
            }
            if(count>maxcount){
                maxcount=count;
                answerRow=i;
            }


        }
        return answerRow;
    }
    public static int lowerbound(int arr[],int m,int x){
        int low=0;
        int mid=0;
        int high=m-1;
        int ans=m;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]>=x){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
            return ans;
    }
    public static int optimal(int arr[][],int n,int m){
        int ansRow=-1;
        int maxcount=0;
        for(int i = 0; i < n; i++){
            int count=m-lowerbound(arr[i], m,1);
            if(count>maxcount){
                maxcount=count;
                ansRow=i;
            }
        }
        return ansRow;
    }
    public static void main(String[] args) {
        int arr[][]={ {1, 1, 1},{0, 0, 1},{0, 0, 0}};
        // int ans=brute(arr);
        int ans=optimal(arr,3,3);
        System.out.println("Row With Maximum 1's : "+ans);
    }
}
