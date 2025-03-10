package _complete.longestprefix;


public class Main {
    public static void main(String args[]) {
        System.out.println("LONGEST PREFIX");
        String[] array = {"flower", "flag", "flee"};
        String[] array1 = {"flower", "ssflag", "aflee"};
        Solution.longestCommonPrefix(array);
    }
}

class Solution {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String pref = strs[0];

        for (int i = 0; i < pref.length(); i++) {
            char cc = pref.charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() <= i || cc != strs[j].charAt(i)) {
                    return pref.substring(0, i);
                }
            }
        }
        return pref;
    }
}
