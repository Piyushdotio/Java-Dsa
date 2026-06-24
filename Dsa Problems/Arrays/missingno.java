public class missingno {
    public static int missingno(int arr[],int range){
        int n=arr.length;
        for(int i = 0; i <=range; i++){
            boolean found=false;
            for(int j = 0; j < n; j++){
                if(arr[j]==i){
                    found=true;
                    break;
                }
            }
           if(!found) 
            return i;
        }
        return -1;
    }

    public static int missingnobetter(int arr[],int range){
        int n=arr.length;
        int hash[]=new int[range+1];
        for(int i = 0; i < n; i++){
            hash[arr[i]]=1;
        }
        for(int i = 0; i <=range; i++){
            if(hash[i]!=1){
                return i;
            }
        }
        return -1;
    }
    public static int missingnooptimal(int arr[],int range){
        int m=arr.length;
        int rangesum=0;
        int arrsum=0;
        for(int i = 0; i <= range; i++){
            rangesum+=i;
        }
        for(int i = 0; i < m; i++){
            arrsum+=i;
        }
        int missingno=rangesum-arrsum;
        return missingno;
    }
    
    public static int xorapproach(int arr[]){
        int n=arr.length;
        int xor1=0;
        int xor2=0;
        for(int i = 0; i < n; i++){
            xor1 ^=arr[i];
            xor2 ^=i;
        }
        xor2 ^=n;
        return xor1 ^ xor2;
    }
    
    public static void main(String[] args) {
        int arr[]={0,2,3,1,4};
        // int number=missingnooptimal(arr,5);
        int num=xorapproach(arr);
        System.out.println(num);
    }
}
