public class removeOuterMost {

    public static String brute(String s) {
        StringBuilder ans = new StringBuilder();
        int depth = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                if (depth > 0) {
                    ans.append(s.charAt(i));
                }
                depth++;
            } else {
                depth--;
                if (depth > 0) {
                    ans.append(s.charAt(i));
                }
            }

        }

        return ans.toString();
    }

    public static void main(String[] args) {
        String s = brute("(()())(())");
        System.out.println(s);

    }
}