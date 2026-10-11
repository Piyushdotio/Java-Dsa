public class NestingDepth {
    public static int  brute(String s){
     
        int depth=0;
        int ans=Integer.MIN_VALUE;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)=='('){
                    depth++;  
                    ans=Math.max(ans, depth); 
            }
            else if(s.charAt(i)==')'){
                depth--;
            }
        }


        return ans;
    }
    public static void main(String[] args) {
        int s=brute("(1+(2*3)+((8)/4))+1");
        System.out.println(s);
    }
}
