import java.util.HashMap;

public class reverseString {
    public static String brute(String s) {
        String[] words = s.trim().split("\\s+");// \\s+ is used to Ek ya zyada consecutive whitespace characters par
                                                // split
        String ans = "";
        for (int i = words.length - 1; i >= 0; i--) {
            ans = ans + words[i] + " ";
        }
        return ans.trim();
    }

    public static String optimal(String s) {
        int i = s.length() - 1;
        StringBuilder ans = new StringBuilder();
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            int end = i;
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }
            int start = i + 1;
            String word = s.substring(start, end + 1);
            if (ans.length() > 0) {
                ans.append(" ");
            }
            ans.append(word);
        }

        return ans.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(optimal(" hello world "));
    }
}