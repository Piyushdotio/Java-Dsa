public class binarysearch {
    public static int binarysearch(int[] n,int key){
        int start=0;
        int end=n.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(n[mid]==key){//found
                return mid;
            }
            else if(n[mid]<key){//right
                start=mid+1;
            }else{//left
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6,9,20};
        int key=0;
        System.out.println("Index of key is : "+binarysearch(arr, key));
    }
}
