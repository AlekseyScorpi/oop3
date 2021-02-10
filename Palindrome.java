import java.util.Locale;

public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            System.out.println(isPalindrome(s));
        }
    }
    public static String reverseString(String s) {
        String newStr = "";
        for (int i = s.length() - 1; i >= 0; i--){
            newStr += s.charAt(i); //add each symbol from original str to reverseStr
        }
        return newStr;
    }
    public static boolean isPalindrome(String s){
        s = s.toLowerCase();
        String reverse = reverseString(s); //save reverseStr for logical check
        return s.equals(reverse);
    }
}
