package _complete.sumtwo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("SUM TWO");
        int[] arr = {2, 7, 11, 15};
        int[] arr1 = {3,2,4};
        System.out.println(Solution.twoSum(arr1, 6)[0]);
        System.out.println(Solution.twoSum(arr1, 6)[1]);
    }
}


class Solution {
    public static int[] twoSum(int[] nums, int target) {

        for (int j = 0; j < nums.length - 1; j++) {
            for (int i = j + 1; i < nums.length; i++) {
                if (target == nums[j] + nums[i]) {
                    return new int[]{i,j};

                }
            }
        }
        return new int[]{0,0};
    }
}