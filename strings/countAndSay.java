public class countandsay {
    public static String brute(int n){
        if(n==1){
            return "1";
        }
        String say=brute(n-1);
        //process
        String result="";
        for(int i = 0; i <say.length(); i++){
            char ch=say.charAt(i);
            int count=1;
            while(i<say.length()-1&&say.charAt(i)==say.charAt(i+1)){
                count++;
                i++;
            }
            result+=String.valueOf(count)+ch;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(brute(4));
    }
}
