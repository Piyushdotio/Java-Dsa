public class reverseString {
    public static void brute(char[] s,int left,int right){
        if(left>=right){
            return;
        }
        char temp=s[left];
        s[left]=s[right];
        s[right]=temp;
        brute(s,left+1,right-1);
         
        
    }
    public static void main(String[] args) {
        char[] s= {'h','e','l','l','o'};
        brute(s,0,4);
        for(int i =0; i <s.length; i++){
            System.out.println(s[i]);
        } 
    }
}
