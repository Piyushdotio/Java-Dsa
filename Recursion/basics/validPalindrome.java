public class validPalindrome {
    public static boolean brute(String s,int left,int right){
        if(left>=right){
            return true;
        }
        if(!Character.isLetterOrDigit(s.charAt(left))){
            return brute(s,left+1,right);
            
        }
        if(!Character.isLetterOrDigit(s.charAt(right))){
            return brute(s,left,right-1);
        }
        
        if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
            return false;
        }
       
        return brute(s,left+1,right-1);
        
      

    }
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        int left=0;
        int right=s.length()-1;
        boolean ans=brute(s,left,right);
        System.out.println(ans);
    }
}
