public class beautyofSrings {
    public static int[] frequency(String s){
        int arr[]=new int[26];
        for(int k = 0; k < s.length(); k++){
            arr[s.charAt(k)-'a']++;
        }
        return arr;
    }
    public static int brute(String s){
        int n=s.length();
        int total=0;
        for(int i = 0; i < n; i++){
            for(int j=i; j < n; j++){
                String sub=s.substring(i,j+1);
                int ans[]=frequency(sub);
                int max=0;
                int min=Integer.MAX_VALUE;
                for(int p = 0; p < ans.length; p++){
                    if(ans[p]>0){
                        max=Math.max(max,ans[p]);
                        min=Math.min(min,ans[p]);
                    }
                }
                total+=max-min;
            }
        }
        return total;
    }
    
    public static void main(String[] args) {
        System.out.println(brute("aabcb"));
    }
}
