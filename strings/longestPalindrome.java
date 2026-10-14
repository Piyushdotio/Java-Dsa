public class longestPalindrome {
    public static boolean checkPalindrome(String sub){
        int left=0;
        int right=sub.length()-1;
        while(left<right){
            if(sub.charAt(left)!=sub.charAt(right)){
                return false;
            }
            left++;
            right--;

        }
        return true;
    }
    
    
    public static String brute(String s){
        String ans="";
        String longest="";
        int length=0;
        for(int i = 0; i <s.length(); i++){
            for(int j = i; j < s.length(); j++){
                String sub = s.substring(i, j + 1);
                if(checkPalindrome(sub)){
                    if(sub.length()>length){
                        longest=sub;

                        length=sub.length();
                    }
                }
            
            }
        }
        return longest;
    }


    public static int helper(String s,int left,int right){
        while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
    public static String optimal(String s) {
        int n=s.length();
        int start =0;
        int maxlength=0;
        for(int i = 0; i < n; i++){
           int odd=helper(s, i, i);
           int even=helper(s, i, i+1);
           int length=Math.max(odd, even);
           if(length>maxlength){
            maxlength=length;
            start=i-(length-1)/2;
           }
       }
       return s.substring(start,start+maxlength);
    }
    public static void main(String[] args) {
        System.out.println(optimal("babad"));
    }
}
