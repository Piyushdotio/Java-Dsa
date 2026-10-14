public class minparenthvalid{
    public static int brute(String s){
        int n=s.length();
        int open=0;
        int ans=0;
        for(int i = 0; i < n; i++){
            if(s.charAt(i)=='('){
                open++;
            }else{
                if(open>0){
                    open--;
                }
                else{
                    ans++;
                }
            }
            
            
        }
        return ans+open;
    }
    public static void main(String[] args) {
        System.out.println(brute("())"));
    }
}
