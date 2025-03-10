package _complete.romannumbers;

import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Roman Numbers");
        String s = "MCMXCIV";
        System.out.println(Solution.romanToInt(s));

    }
}

class Solution {
    public static int romanToInt(String s) {
        int digit = 0;

        HashMap<Character, Integer> dic = new HashMap<>();
        dic.put('I', 1);
        dic.put('V', 5);
        dic.put('X', 10);
        dic.put('L', 50);
        dic.put('C', 100);
        dic.put('D', 500);
        dic.put('M', 1000);
        for (int i = 0; i < s.length(); i++) {
            char cc = s.charAt(i);
            if (i + 1 < s.length()) {
                char nc = s.charAt(i + 1);
                if (dic.get(cc) < dic.get(nc)) {
                    digit += dic.get(nc) - dic.get(cc);
                    i++;
                } else {
                    digit += dic.get(cc);
                }
            } else {
                digit += dic.get(cc);
            }
        }
        return digit;
    }
}