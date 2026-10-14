public class StringToIntAtoi {
    public static int brute(String s) {
        int ans = 0;
        int sign = 1;
        int i = 0;
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }
        if (i < s.length() && s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (i < s.length() && s.charAt(i) == '+') {
            sign = 1;
            i++;
        }
        while (i < s.length()) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                int digit = ch - '0';
                if (ans > Integer.MAX_VALUE / 10 ||
                        (ans == Integer.MAX_VALUE / 10 && digit > 7)) {
                    return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                ans = ans * 10 + digit;
                i++;
            } else {
                break;
            }
        }

        return ans * sign;
    }

    public static void main(String[] args) {
        int ans = brute(" -042");
        System.out.println(ans);
    }
}