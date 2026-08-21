public class bouquets{
    public static int greater(int arr[]){
        int n=arr.length;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            ans=Math.max(arr[i],ans);
        }
        return ans;
    }
    public static boolean totalbouquet(int arr[],int day,int m,int k){
        int count=0;
        int bouquets=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=day){
                count++;
            }
            else{
                bouquets+=(count/k);
                count=0;
            }
            if(bouquets>=m){
                return true;
            }


        }
        bouquets+=(count/k);
        return bouquets>=m;
    }
    
    public static int brute(int arr[],int m,int k){
        int n=arr.length;
        if((long)m*k>n){
            return -1;
        }
        for(int i=1;i<greater(arr);i++){
            if(totalbouquet(arr,arr[i], m, k)==true){
                return arr[i];
            }
            
        }
        return -1;
    }


    public static int minDay(int arr[],int m,int k){
        int n=arr.length;
        if((long)m*k>n){
            return -1;
        }
        int low=1;
        int mid=0;
        int high=greater(arr);
        int answer=0;
        while(low<=high){
            mid=(low+high)/2;
            boolean ans=totalbouquet(arr, mid,m, k);
            if(ans==true){
                answer=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return answer ;
    }
    public static void main(String[] args) {
        int arr[]={7,7,7,7,12,7,7};
        System.out.println(brute(arr,2,3));;
    }
}