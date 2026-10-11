public class basics {
    public static void main(String[] args) {
        String firstname = "Piyush";
        String lastname = "Singh";
        System.out.println(firstname + " " + lastname);
        System.out.println(firstname.charAt(1));
        System.out.println(firstname.substring(1));
        System.out.println(firstname.substring(1, 4));
        System.out.println(firstname.equals(lastname));
        char[] arr = firstname.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        String f = "banana";
        int freq[] = new int[26];
        for (int i = 0; i < f.length(); i++) {
            freq[f.charAt(i) - 'a']++;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {

                System.out.println((char) (i + 'a') + "=" + freq[i]);
            }
        }

        // new string banta hai modify kerne per
        String s = "abc";
        s += "d";
        System.out.println(s);

        // stringbuilder old string mai hi modify kerta hai

        StringBuilder so = new StringBuilder("hello");
        so.append("World");
        so.reverse();
        System.out.println(so);

        // String are immutable

        String name = "cat";
        name = "Dog";
        System.out.println(name.length());
        System.out.println(name.charAt(2));

        char ch = 'a';
        System.out.println(Character.isDigit(ch));
        System.out.println(Character.isLetter('A')); // true
        System.out.println(Character.isLetter('z')); // true
        System.out.println(Character.isLetter('5')); // false
        System.out.println(Character.isLetter('@')); // false

    }
}