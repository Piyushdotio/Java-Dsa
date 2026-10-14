public class countNoOfStrings{
    public static long brute(String s){
        int n=s.length();
        long ans=0;
  
        for(int i = 0; i <n; i++){
            int freq[]=new int[10];
            for(int j = i; j < n; j++){
                freq[s.charAt(j)-'a']++;
                int oddcount=0;
                for(int k = 0; k <freq.length; k++){
                    if(freq[k]%2!=0){
                        oddcount++;
                    }
                    
                }
                if(oddcount<=1){
                        ans++;
                    }
            }
           
        }
        return ans;
    }
    public static void main(String[] args) {
       System.out.println( brute("aba"));
    }
}