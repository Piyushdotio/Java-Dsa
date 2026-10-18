import java.util.List;
import java.util.ArrayList;
public class calParentheses{
    public static List<String> brute(int n){
        ArrayList<String> ans=new ArrayList<>();
        helper(n,ans,"",0,0);

        return ans;
    }
    private static List<String> helper(int n,ArrayList<String> ans,String s,int open,int close){
        if(open==n&&close==n){
            ans.add(s);
            return ans;
        }
        if(open<n){
            helper(n, ans, s+"(", open+1, close);
        }
        if(close<open){
            helper(n, ans, s+")", open, close+1);
        }
        return ans;
    }
    public static void main(String[] args){
        System.out.println(brute(3));
    }
}