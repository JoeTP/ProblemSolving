package _complete.validatebrackets;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("BRACKETS");
        String s = "(){}{}{]";
        System.out.println(Solution.isValid(s));
    }
}


class Solution {
    public static boolean isValid(String s) {
        boolean valid = false;

        Stack<Character> stack = new Stack();

        if (s.isEmpty() || s.isBlank()) return false;
        List<Character> oP = Arrays.asList('{', '[', '(');
        for (char c : s.toCharArray()) {
            if (oP.contains(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char tos = stack.pop();
                    if (tos == '[' && c != ']') return false;
                    if (tos =='{' && c != '}') return false;
                    if (tos == '(' && c != ')') return false;
                }
            }
        }
        if(stack.isEmpty()){
            valid = true;
        }
        return valid;
    }
}