package staircase;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Stair Case");

    }
}

// 10
// 1 1 1 1 1 1 1 1 1 1
// 1 1 1 1 1 1 1 1 2
// 1 1 1 1 1 1 2 2
// 1 1 1 1 2 2 2
// 1 1 2 2 2 2
// 2 2 2 2 2
// 2 1 1

class Solution {
    public int climbStairs(int n) {
        int ways = n;
        if(n%2 == 0){
            ways = 3;
        }

        return ways;
    }
}