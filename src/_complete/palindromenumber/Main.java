package _complete.palindromenumber;

public class Main {
    public static void main(String[] args) {
        System.out.println("PalindromeNumber");
        System.out.println(Solution.isPalindrome(11));

    }
}

class Solution {
    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        int s1 = 0;
        int s2 = str.length() - 1;

        while (s1 < s2) {
            if (str.charAt(s1) != str.charAt(s2))
                return false;
            s1++;
            s2--;
        }
        return true;
    }
}